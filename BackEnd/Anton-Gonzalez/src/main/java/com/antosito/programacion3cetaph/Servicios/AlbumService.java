package com.antosito.programacion3cetaph.Servicios;

import com.antosito.programacion3cetaph.Entidades.Albums;

import java.util.List;

public interface AlbumService extends BaseServices<Albums,Long>{

    List<Albums>SearchAlbums(Boolean filtroVil,
                             String filtroName,
                             Float filtroPriceMax,
                             Float filtroPriceMin,
                             Boolean fitroExp) throws Exception;

}
