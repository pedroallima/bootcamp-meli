package com.meli.desafiospringboot2209.persistence;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meli.desafiospringboot2209.dto.ConsultaDTO;
import com.meli.desafiospringboot2209.dto.ProprietarioDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.meli.desafiospringboot2209.util.ReadFileUtil;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProprietarioPersistence {


    String arquivo = "proprietario.json";
    String caminho = "db";
    String cC = caminho+"/"+arquivo;
    Gson gson = new Gson();

    List<ProprietarioDTO> listaProprietarios = new ArrayList<>();
    ObjectMapper objectMapper = new ObjectMapper();

    private void mapearObjeto() {
        objectMapper.findAndRegisterModules();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    public ProprietarioDTO salvarProprietarioNoArquivo(ProprietarioDTO proprietarioDTO) {
        mapearObjeto();
        try {
            if (verificaNull(proprietarioDTO)) {
                throw new RuntimeException("Os campos não podem ser nulos");
            }
            
            if (proprietarioJaCadastrado(proprietarioDTO.getCpf())) {
                throw new RuntimeException("Proprietario já cadastrado");
            }
            listaProprietarios.add(proprietarioDTO);
            objectMapper.writeValue(new File(cC), listaProprietarios);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return proprietarioDTO;
    }

    public boolean proprietarioJaCadastrado(String cpf) throws IOException {
        listaProprietarios = buscarProprietario();
        if (listaProprietarios.size() > 0) {
            for (ProprietarioDTO proprietarioDTO : listaProprietarios) {
                if (proprietarioDTO.getCpf().equals(cpf)) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    public boolean verificaNull(ProprietarioDTO proprietarioDTO) {
        if (proprietarioDTO.getCpf() == null
                || proprietarioDTO.getNome() == null
                || proprietarioDTO.getSobrenome() == null
                || proprietarioDTO.getDataNascimento() == null
                || proprietarioDTO.getEndereco() == null
                || proprietarioDTO.getTelefone() == null) {
            return true;
        } else {
            return false;
        }
    }

    public List<ProprietarioDTO> buscarProprietario() {
        mapearObjeto();
        try {
            listaProprietarios = objectMapper.readValue(new File(cC), new TypeReference<List<ProprietarioDTO>>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listaProprietarios;
    }

    public void removerProprietarioPorCpf(String cpf) {
        try {
            String json = ReadFileUtil.readFile(cC);
            Gson gson = new Gson();
            List<ProprietarioDTO> proprietarioDTOS = gson.fromJson(json, new TypeToken<List<ProprietarioDTO>>() {
            }.getType());
            for (ProprietarioDTO item : proprietarioDTOS) {
                if (item.getCpf().equals(cpf)) {
                    if(ConsultaProprietarioRegistrada(cpf)){
                        throw new RuntimeException("Impossivel excluir, existe uma consulta agendada");
                    }
                    proprietarioDTOS.remove(item);
                    break;
                }
            }
            objectMapper.writeValue(new File(cC), proprietarioDTOS);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao deletar ID");
        }
    }


    public void atualizarProprietario(ProprietarioDTO payLoad) {
        try {
            String json = ReadFileUtil.readFile(cC);
            Gson gson = new Gson();

            ProprietarioDTO registros = payLoad;
            String cpf = registros.getCpf();

            List<ProprietarioDTO> proprietarioDTOS = gson.fromJson(json, new TypeToken<List<ProprietarioDTO>>() {
            }.getType());

            Integer contNull = 0;
            Integer contOk = 0;

            for (ProprietarioDTO item : proprietarioDTOS) {
                if (registros.getCpf() == null)
                {throw new RuntimeException("Impossivel aterar sem o numero do CPF");}

                if (item.getCpf().equals(cpf)) {

                    if (registros.getNome() != null){
                        if(registros.getNome().equals(item.getNome())){contOk++;}
                        item.comNome(registros.getNome());
                    }else {registros.comNome(item.getNome());contNull++;}

                    if (registros.getSobrenome() != null){
                        if(registros.getSobrenome().equals(item.getSobrenome())){contOk++;}
                        item.comSobrenome(registros.getSobrenome());
                    }else {registros.comSobrenome(item.getSobrenome());contNull++;}

                    if (registros.getDataNascimento() != null){
                        if(registros.getDataNascimento().equals(item.getDataNascimento())){contOk++;}
                        item.comDataNascimento(registros.getDataNascimento());
                    }else {registros.comDataNascimento(item.getDataNascimento());contNull++;}

                    if (registros.getEndereco() != null){
                        if(registros.getEndereco().equals(item.getEndereco())){contOk++;}
                        item.comEndereco(registros.getEndereco());
                    }else {registros.comEndereco(item.getEndereco());contNull++;}

                    if (registros.getTelefone() != null){
                        if(registros.getTelefone().equals(item.getTelefone())){contOk++;}
                        item.comTelefone(registros.getTelefone());
                    }else {registros.comTelefone(item.getTelefone());contNull++;}

                    if(contNull == 5 && contOk == 0)
                    {throw new RuntimeException("E necessario pelomenos 1 parametro alem CPF para poder alterar.");}else
                    if (contNull == 0 && contOk == 5)
                    {throw new RuntimeException("E necessario que pelomenos 1 parametro seja diferente para alterar.");}
                    break;
                }
            }
            objectMapper.writeValue(new File(cC), proprietarioDTOS);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao alterar ID");
        }
    }

    public boolean ConsultaProprietarioRegistrada(String Cpf){
        try {
            String proprietarioConsultaArquivo = ReadFileUtil.readFile("db/consultas.json");
            List<ConsultaDTO> ConsultaS = gson.fromJson(proprietarioConsultaArquivo, new TypeToken<List<ConsultaDTO>>(){}.getType());
            for (ConsultaDTO item: ConsultaS) {
                if (item.getCpfProprietario().equals(Cpf)){
                    return true;
                }
            }
        }catch (IOException e){
            e.printStackTrace();
            return false;
        }
        return false;
    }


}
