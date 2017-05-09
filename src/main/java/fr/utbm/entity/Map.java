/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.entity;

/**
 *
 * @author PanJin
 */
public class Map {
    
    private Integer id;
    private String description;
    private Integer px_width;
    private Integer px_height;
    private Double m_width;
    private Double m_height;
    private byte content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPx_width() {
        return px_width;
    }

    public void setPx_width(Integer px_width) {
        this.px_width = px_width;
    }

    public Integer getPx_height() {
        return px_height;
    }

    public void setPx_height(Integer px_height) {
        this.px_height = px_height;
    }

    public Double getM_width() {
        return m_width;
    }

    public void setM_width(Double m_width) {
        this.m_width = m_width;
    }

    public Double getM_height() {
        return m_height;
    }

    public void setM_height(Double m_height) {
        this.m_height = m_height;
    }

    public byte getContent() {
        return content;
    }

    public void setContent(byte content) {
        this.content = content;
    }

    
}
