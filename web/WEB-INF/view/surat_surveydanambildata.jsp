<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Membuat Surat Jenis A</title>
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

        <div class="home">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">Surat Survey dan Pengambilan Data</h1>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>

                <div class="row">
                    <div class="col-lg-12">
                        <div class="panel panel-primary">
                            <div class="panel-heading">
                                Form Surat Survey dan Pengambilan Data

                            </div>
                            <div class="panel-body">
                                <div class="col-lg-6">
                                    <div class="table-responsive">
                                        <table class="table table-striped table-bordered table-hover">
                                            <thead>
                                                <tr>
                                                    <th>No.</th>
                                                    <th>Nama</th>
                                                    <th>NRP</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <tr>
                                                    <td>1</td>
                                                    <td><input class="form-control"></td>
                                                    <td><input class="form-control"></td>
                                                </tr>
                                                <tr>
                                                    <td>2</td>
                                                    <td><input class="form-control"></td>
                                                    <td><input class="form-control"></td>
                                                </tr>
                                                <tr>
                                                    <td>3</td>
                                                    <td><input class="form-control"></td>
                                                    <td><input class="form-control"></td>
                                                </tr>
                                                <tr>
                                                    <td>4</td>
                                                    <td><input class="form-control"></td>
                                                    <td><input class="form-control"></td>
                                                </tr>
                                                <tr>
                                                    <td>5</td>
                                                    <td><input class="form-control"></td>
                                                    <td><input class="form-control"></td>
                                                </tr>
                                                <tr>
                                                    <td>6</td>
                                                    <td><input class="form-control"></td>
                                                    <td><input class="form-control"></td>
                                                </tr>
                                                <tr>
                                                    <td>7</td>
                                                    <td><input class="form-control"></td>
                                                    <td><input class="form-control"></td>
                                                </tr>
                                                <tr>
                                                    <td>8</td>
                                                    <td><input class="form-control"></td>
                                                    <td><input class="form-control"></td>
                                                </tr>
                                                <tr>
                                                    <td>9</td>
                                                    <td><input class="form-control"></td>
                                                    <td><input class="form-control"></td>
                                                </tr>
                                                <tr>
                                                    <td>10</td>
                                                    <td><input class="form-control"></td>
                                                    <td><input class="form-control"></td>
                                                </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                    <div class="col-lg-10">
                                        <div class="panel panel-default">
                                            <div class="panel-heading">
                                                Instansi/Perusahaan yang Dituju
                                            </div>
                                            <div class="panel-body">
                                                <div class="form-group">
                                                    <label>Nama Instansi</label>
                                                    <input class="form-control" placeholder="Enter text">
                                                </div>
                                                <div class="form-group">
                                                <label>Kepada Yth/Jabatan</label>
                                                <input class="form-control" placeholder="Enter text">
                                                </div>
                                                <div class="form-group">
                                                <label>Mata Kuliah</label>
                                                <input class="form-control" placeholder="Enter text">
                                                </div>
                                                <div class="form-group">
                                                <label>Alamat</label>
                                                <textarea class="form-control" rows="3"></textarea>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <div class="col-lg-4">
                                    <div class="panel panel-default">
                                        <div class="panel-heading">
                                            Instansi/Perusahaan yang Dituju
                                        </div>
                                        <div class="panel-body">
                                            <label>Survey Mengenai</label>
                                            <textarea class="form-control" rows="2"></textarea>
                                            <br>
                                            <div class="table-responsive">
                                                <table class="table table-striped table-bordered table-hover">
                                                    <thead>
                                                        <tr>
                                                            <th>No.</th>
                                                            <th>Data yang Dibutuhkan</th>
                                                        </tr>
                                                    </thead>
                                                    <tbody>
                                                        <tr>
                                                            <td>1</td>
                                                            <td><input class="form-control"></td>
                                                        </tr>
                                                        <tr>
                                                            <td>2</td>
                                                            <td><input class="form-control"></td>
                                                        </tr>
                                                        <tr>
                                                            <td>3</td>
                                                            <td><input class="form-control"></td>
                                                        </tr>
                                                        <tr>
                                                            <td>4</td>
                                                            <td><input class="form-control"></td>
                                                        </tr>
                                                    </tbody>
                                                </table>
                                            </div>
                                            <br>
                                            <label>Ketua Kelompok</label>
                                            <div class="row">
                                                <div class="col-lg-10">
                                                    <div class="form-group">
                                                        <select class="form-control">
                                                            <option>A</option>
                                                            <option>B</option>
                                                            <option>C</option>
                                                            <option>D</option>
                                                        </select>
                                                    </div>
                                                </div>
                                                <div class="col-lg-2">
                                                    <button type="button" class="btn btn-default btn-circle"><i class="fa fa-refresh"></i>
                                                    </button>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4">

                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <div class="row">
                    <div class="col-lg-offset-10">
                        <p>
                            <button type="button" class="btn btn-primary btn-lg">Preview</button>
                        </p>
                        <p> 
                            <button type="button" class="btn btn-primary btn-lg">Submit</button>
                        </p>
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
