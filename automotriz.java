import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

class Registroproducto {
        private int codigoProducto;
        private String nombreProducto;
        private String lineaProduccion;
        private int cantidadProducto;
        private int cantidadDefectuosa;
        private double costoUnitario;
        private int minutosUtilizados;
        private double kgMateriaPrima;
        private int metaProduccion;

        public Registroproducto(int codigoProducto, String nombreProducto, String lineaProduccion, int cantidadProducto, int cantidadDefectuosa, double costoUnitario, int minutosUtilizados, double kgMateriaPrima, int metaProduccion){
            this.codigoProducto = codigoProducto;
            this.nombreProducto = nombreProducto;
            this.lineaProduccion = lineaProduccion;
            this.cantidadProducto = cantidadProducto;
            this.cantidadDefectuosa = cantidadDefectuosa;
            this.costoUnitario = costoUnitario;
            this.minutosUtilizados = minutosUtilizados;
            this.kgMateriaPrima = kgMateriaPrima;
            this.metaProduccion = metaProduccion;
        }

        public int getCodigoProducto(){
            return codigoProducto;
        }

        public String getNombreProducto(){
            return nombreProducto;
        }

        public String getLineaProduccion(){
            return lineaProduccion;
        }   

        public int getCantidadProducto(){
            return cantidadProducto;
        }
        public int getCantidadDefectuosa(){
            return cantidadDefectuosa;
        }

        public double getCostoUnitario(){
            return costoUnitario;
        }

        public int getMinutosUtilizados(){
            return minutosUtilizados;
        }

        public double getKgMateriaPrima(){
            return kgMateriaPrima;
        }

        public int getMetaProduccion(){
            return metaProduccion;
        }

        @Override
        public String toString(){
            return "Registroproducto{" +
                    "codigoProducto=" + codigoProducto +
                    ", nombreProducto='" + nombreProducto + '\'' +
                    ", lineaProduccion='" + lineaProduccion + '\'' +
                    ", cantidadProducto=" + cantidadProducto +
                    ", cantidadDefectuosa=" + cantidadDefectuosa +
                    ", costoUnitario=" + costoUnitario +
                    ", minutosUtilizados=" + minutosUtilizados +
                    ", kgMateriaPrima=" + kgMateriaPrima +
                    ", metaProduccion=" + metaProduccion +
                    '}';
        }   
}

