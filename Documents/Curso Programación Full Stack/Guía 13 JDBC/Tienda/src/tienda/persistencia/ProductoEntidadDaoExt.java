/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.persistencia;

import tienda.entidades.Producto;
import tienda.servicios.ProductService;

/**
 *
 * @author Rocio
 */
public final class ProductoEntidadDaoExt extends DAO{
  //  private final ProductService productoService;
    
    public void guardarProducto(Producto producto) throws Exception{
       try{
           if (producto==null) {
               throw new Exception("Debe indicar el producto");               
           }
           String sql = "INSERT INTO Producto (nombre, codigo, precio, codigo del fabricante )" +
                   "VALUES ( '" + producto.getNombre() + "' , '" + producto.getCodigo().toString() + "' , '" +producto.getPrecio().toString()+ "' , '"+ producto.getCodigoFabricante().toString()+"' )";
insertarModificarEliminar(sql);
       }catch(Exception e){
       throw e;
       }finally{
           desconectarBase();
       }
}}
