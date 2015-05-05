<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Membuat Surat Jenis C</title>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">
        
         <!-- Bootstrap Core CSS -->
        <link href="./bower_components/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">

        <!-- MetisMenu CSS -->
        <link href="./bower_components/metisMenu/dist/metisMenu.min.css" rel="stylesheet">

        <!-- Timeline CSS -->
        <link href="./dist/css/timeline.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="./dist/css/sb-admin-2.css" rel="stylesheet">

        <!-- Morris Charts CSS -->
        <link href="./bower_components/morrisjs/morris.css" rel="stylesheet">

        <!-- Custom Fonts -->
        <link href="./bower_components/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        
        <!-- Custom CSS -->
        <link href="./custom_style/cus.css" rel="stylesheet" type="text/css">
        <style type="text/css">
        #apDiv1 {
	position: absolute;
	width: 72px;
	height: 63px;
	z-index: 1001;
	bottom: 25px;
	right: 25px;
}
        </style>
        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>
    <body class="home">
        <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <a class="navbar-brand" href="index.html">NAMA APLIKASI</a>
            </div>

            <ul class="nav navbar-top-links navbar-right">
                <li><a href="index.html"><i class="fa fa-sign-out fa-fw"></i>Logout</a>
                </li>
            </ul>

            <ul class="nav navbar-top-links navbar-left">
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        Jenis Surat <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-user">
                        <li><a href="suratSurveydanData">Surat Survey dan Pengambilan Data</a>
                        </li>
                        <li><a href="suratKeteranganLulus">Surat Keterangan Lulus</a>
                        </li>
                        <li><a href="suratKeteranganMahasiswa">Surat Keterangan Mahasiswa</a>
                        </li>
                    </ul>
                    <!-- /.dropdown-user -->
                </li>
            </ul>
    </nav>
        <div class="col-md-12">
          <p>
            <input type="submit"  value="Preview">
          </p>
          <p> 
            <input type="submit"  value="Submit">
          </p>
        </div>
        <div class="home">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-sm-12 col-md-12">
                        <h1 class="page-header">Membuat Surat Form Survey dan Pengambilan Data</h1>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>

                <div class="row">
                    <div class="col-sm-12 col-md-12">
                        <p>Daftar Nama Pengaju Form</p>
                    </div>
                    <!-- /.col-lg-12 -->                    
                </div>
                <div class="row">
                    <div class="col-sm-5 col-md-5">
                        <div class="col-sm-8 col-md-12">
                            <form role="form">
                            <fieldset>
                                <div class="form-group">
                                    <input class="form-control" placeholder="Nama Mahasiswa" autofocus>
                                </div>
                                <div class="form-group">
                                    <input class="form-control" placeholder="Nama Mahasiswa" autofocus>
                                </div>
                                <div class="form-group">
                                    <input class="form-control" placeholder="Nama Mahasiswa" autofocus>
                                </div>
                                <div class="form-group">
                                    <input class="form-control" placeholder="Nama Mahasiswa" autofocus>
                                </div>
                                <div class="form-group">
                                    <input class="form-control" placeholder="Nama Mahasiswa" autofocus>
                                </div>
                                <div class="form-group">
                                    <input class="form-control" placeholder="Nama Mahasiswa" autofocus>
                                </div>
                            </fieldset>
                            </form>
                        </div>
                    </div>
                    <div class="col-sm-5 col-md-3">
                        <div class="col-sm-8 col-md-12">
                            <form role="form">
                            <fieldset>
                                <div class="form-group">
                                    <input class="form-control" placeholder="NRP Mahasiswa" autofocus>
                                </div>
                                <div class="form-group">
                                    <input class="form-control" placeholder="NRP Mahasiswa" autofocus>
                                </div>
                                <div class="form-group">
                                    <input class="form-control" placeholder="NRP Mahasiswa" autofocus>
                                </div>
                                <div class="form-group">
                                    <input class="form-control" placeholder="NRP Mahasiswa" autofocus>
                                </div>
                                <div class="form-group">
                                    <input class="form-control" placeholder="NRP Mahasiswa" autofocus>
                                </div>
                                <div class="form-group">
                                    <input class="form-control" placeholder="NRP Mahasiswa" autofocus>
                                </div>
                            </fieldset>
                            </form>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-12 col-md-6">
                        <p>Instansi/Perusahaan yang dituju</p>
                    </div>                    
                </div>
                <div class="row">
                    <div class="col-sm-12 col-md-8">
                            <div class="col-sm-5 col-md-12">
                                <form role="form">
                                    <fieldset>
                                        <div class="form-group">
                                            <input class="form-control" placeholder="Nama Instansi" autofocus>
                                        </div>
                                    </fieldset>
                                </form>
                            </div>                           
                    </div>                  
                </div>
                <div class="row">
                        <div class="col-sm-12 col-md-8">
                            <div class="col-sm-5 col-md-6">
                                <form role="form">
                                    <fieldset>
                                        <div class="form-group">
                                            <input class="form-control" placeholder="Kepada Yth" autofocus>
                                        </div>
                                    </fieldset>
                                </form>
                            </div>
                            <div class="col-sm-5 col-md-6">
                                <form role="form">
                                    <fieldset>
                                        <div class="form-group">
                                            <input class="form-control" placeholder="Jabatan" autofocus>
                                        </div>
                                    </fieldset>
                                </form>
                            </div>
                        </div>                 
                </div>
                <div class="row">
                    <div class="col-sm-12 col-md-8">
                            <div class="col-sm-5 col-md-12">
                                <form role="form">
                                    <fieldset>
                                        <div class="form-group">
                                            <input class="form-control" placeholder="Alamat Instansi" autofocus>
                                        </div>
                                        <div class="form-group">
                                            <input class="form-control" placeholder="Mata Kuliah" autofocus>
                                        </div>
                                    </fieldset>
                                </form>
                            </div>                           
                    </div>                  
                </div>
                <div class="row">
                    <div class="col-sm-12 col-md-8">
                        <p>Survey mengenai</p>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-12 col-md-8">
                        <div class="col-sm-6 col-md-12">
                            <form role="form">
                                <fieldset>
                                    <div class="Form-group">
                                        <input class="form-control" placeholder="Keperluan Survey" autofocus>                                    
                                    </div>
                                </fieldset>
                            </form>
                        </div>
                    </div> 
                </div>
                <div class="row">
                    <div class="col-sm-12 col-md-8">
                        <p>Data yang diperlukan</p>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-12 col-md-8">
                        <div class="col-sm-6 col-md-12">
                            <form role="form">
                                <fieldset>
                                    <div class="form-group">
                                    <input class="form-control" placeholder="Data 1" autofocus>
                                    </div>
                                    <div class="form-group">
                                    <input class="form-control" placeholder="Data 2" autofocus>
                                    </div>
                                    <div class="form-group">
                                    <input class="form-control" placeholder="Data 3" autofocus>
                                    </div>
                                    <div class="form-group">
                                    <input class="form-control" placeholder="Data 4" autofocus>
                                    </div>
                                </fieldset>
                            </form>
                        </div>
                    </div> 
                </div>
            </div>
        </div>

               
            
        
        <!-- jQuery -->
        <script src="./bower_components/jquery/dist/jquery.min.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="./bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

        <!-- Metis Menu Plugin JavaScript -->
        <script src="./bower_components/metisMenu/dist/metisMenu.min.js"></script>

        <!-- Morris Charts JavaScript -->
        <script src="./bower_components/raphael/raphael-min.js"></script>
        <script src="./bower_components/morrisjs/morris.min.js"></script>
        <script src="./js/morris-data.js"></script>

        <!-- Custom Theme JavaScript -->
        <script src="./dist/js/sb-admin-2.js"></script>
        <div></div>
    </body>
</html>
