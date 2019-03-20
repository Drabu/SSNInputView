Setup
Step 1. Add it in your root build.gradle at the end of repositories:

allprojects {
    repositories {
 maven { url 'https://jitpack.io' }
    }
}
Step 2. Add the dependency:

dependencies {
          implementation 'com.github.Drabu:SSNInputView:Tag'
}

<div class="row">
	<div class="col-lg-3"> <!-- repos -->
		<table class="table table-hover reposTable" id="listOfReposTable" style="display: none;">
			<thead>
			<tr>
				<th>Repositories</th>
			</tr>
			</thead>
			<tbody>
			<tr>
				<td></td>
			</tr>
			</tbody>
			<tfoot>
				<tr>
					<td>
						<nav aria-label="...">
							<ul class="pager repoPager">
								<li class="previous"><a href="#" id="prevRepos"><span aria-hidden="true">←</span> </a></li>
								<li class="next"><a href="#" id="nextRepos"> <span aria-hidden="true">→</span></a></li>
							</ul>
						</nav>
					</td>
				</tr>
			</tfoot>
		</table>
	</div>
	<div class="col-lg-9"> <!-- Rest  -->

	<div class="bs-docs-section">
		<div class="row">
			<div class="col-lg-8">
				<div id="title" style="display: none;"></div>
			</div>
		</div>
	</div>

	<div class="row">
		<div class="col-lg-8">
			<ul class="nav nav-tabs" id="projNav" style="">
				<li><a href="" id="releasesLink" class="active">Releases</a></li>
				<li><a href="" id="buildsLink">Builds</a></li>
				<li><a href="" id="branchesView">Branches</a></li>
				<li> <a href="" id="commitsLink" class="shortNav">Commits</a> </li>
				<li><a href="" role="presentation" class="dropdown-toggle shortCaret" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
						<span class="caret"></span>
					</a>
					<ul class="dropdown-menu" id="branches">
						
    				<li><a href="" class="branchLink">master</a></li></ul>
				</li>
				<li class="pull-right"><button title="" id="settingsLink" class="settings btn" style="display: none;"><i class="fa fa-cog"></i></button></li>
			</ul>
			
			<div id="projDetails" style="display: none;"></div>

			<table class="table table-striped table-hover" id="versionTable" style="">
				<thead>
					<tr>
						<th>Version</th>
						<th></th>
						<th class="text-right"><a href="/tests" target="_blank">Tests</a></th>
						<th>Log</th>
						<th class="statusCol">Status</th>
						<th></th>
					</tr>
				</thead>
				<tbody><tr class="verRow"><td class="verCell">1.0.0</td><td class="verFill"><span><span></span></span></td><td class="mid-col"></td><td class="mid-col"><a target="_blank" title="Status: ok" href="/com/github/Drabu/SSNInputView/1.0.0/build.log" class="log"><i class="fa logIcon fa-file-text-o"></i></a></td><td class="statusCol"><a href="#Drabu/SSNInputView/1.0.0"><button class="btn btn-success btn-xs getBtn" ver="1.0.0">Get it</button></a></td><td class="del"><div class="removeCol"><a class="removeBuild" ver="1.0.0"><i ver="1.0.0" class="fa fa-times"></i></a></div></td></tr></tbody>
			</table>
		</div>
		<div class="col-lg-1"></div>
		<div class="col-lg-3">
			<table class="table statsTable" id="statsTable" style="display: none;">
				<thead>
					<tr> <th colspan="2">Downloads</th> </tr>
				</thead>
				<tbody id="statsData">
					<tr> <td>Week</td><td id="weekDl" class="rightCell">12</td> </tr>
					<tr> <td>Month</td><td id="monthDl" class="rightCell">3</td> </tr>
				</tbody>
			</table>
		</div>
	</div>

	<div class="row"></div>

	<div class="row">
		<div class="col-lg-10">
			<h1 class="page-header" id="howto">How to</h1>
		</div>
	</div>

	<div class="row">
		<div class="col-lg-12">
				<p>To get a Git project into your build:</p>
		</div>
	</div>

	<!-- com.github.User:Repo:Tag -->
<div class="row">
	<div class="col-lg-10">
				<p>
					<b>Step 1.</b> Add the JitPack repository to your build file
				</p>
				<div role="tabpanel">

					<ul class="nav nav-tabs">
						<li role="presentation" class="active"><a data-toggle="tab" class="dep gradle active" href="#gradle" aria-expanded="true">gradle</a></li>
						<li role="presentation" class=""><a class="dep maven active" data-toggle="tab" href="#maven" aria-expanded="false">maven</a></li>
						<li role="presentation" class=""><a class="dep sbt active" data-toggle="tab" href="#sbt" aria-expanded="false">sbt</a></li>
                         <li role="presentation" class=""><a class="dep lein active" data-toggle="tab" href="#lein" aria-expanded="false">leiningen</a></li>
					</ul>

					<div class="tab-content">
					      <div role="tabpanel" class="tab-pane active" id="gradle">
                              <p>Add it in your root build.gradle at the end of repositories:</p>
                            <pre class="kode language-css code-toolbar"><code class=" kode language-css">	<span class="token selector">allprojects</span> <span class="token punctuation">{</span>
		<span class="token selector">repositories</span> <span class="token punctuation">{</span>
			<span class="token selector">...
			maven</span> <span class="token punctuation">{</span> url <span class="token string">'https://jitpack.io'</span> <span class="token punctuation">}</span>
		<span class="token punctuation">}</span>
	<span class="token punctuation">}</span></code></pre>
                        </div>
                        
						<div role="tabpanel" class="tab-pane" id="maven">
							<pre class="kode language-markup code-toolbar"><code class=" kode language-markup">	<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>repositories</span><span class="token punctuation">&gt;</span></span>
		<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>repository</span><span class="token punctuation">&gt;</span></span>
		    <span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>id</span><span class="token punctuation">&gt;</span></span>jitpack.io<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>id</span><span class="token punctuation">&gt;</span></span>
		    <span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>url</span><span class="token punctuation">&gt;</span></span>https://jitpack.io<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>url</span><span class="token punctuation">&gt;</span></span>
		<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>repository</span><span class="token punctuation">&gt;</span></span>
	<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>repositories</span><span class="token punctuation">&gt;</span></span></code></pre>
						</div>

						
						<div role="tabpanel" class="tab-pane" id="sbt">

                              <p>Add it in your build.sbt at the end of resolvers:</p>
                            <pre class="kode language-css code-toolbar"><code class=" kode language-css"> 
    resolvers += <span class="token string">"jitpack"</span> at <span class="token string">"https://jitpack.io"</span>
        
    </code></pre>
                        </div>
                        
                        <div role="tabpanel" class="tab-pane" id="lein">

                              <p>Add it in your project.clj at the end of repositories:</p>
                            <pre class="kode language-css code-toolbar"><code class=" kode language-css"> 
    <span class="token punctuation">:</span>repositories [[<span class="token string">"jitpack"</span> <span class="token string">"https://jitpack.io"</span>]]
        
    </code></pre>
                        </div>

					</div>
				</div>
			</div>
		</div>
		
		<div class="row">
			<div class="col-lg-8">
								<p><b>Step 2.</b> Add the dependency</p> 
			</div>
			<div class="col-lg-2 text-right">
				<div class="dropdown" id="subprojects" style="display: none;">
					  <button class="btn btn-default dropdown-toggle" type="button" id="moduleDropdown" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
					    Subproject
					    <span class="caret"></span>
					  </button>
					  <ul class="dropdown-menu" aria-labelledby="moduleDropdown" id="modulesList"></ul>
				</div>
			</div>
		</div>
		
		<div class="row">
			<div class="col-lg-10">

				<div role="tabpanel">
					<div class="tab-content depTabs">
					   <div role="tabpanel" class="tab-pane depTab gradle active">
                            <pre class="kode code-toolbar  language-css"><code id="depCodeGradle" class=" kode  language-css">	<span class="token selector">dependencies</span> <span class="token punctuation">{</span>
	        implementation <span class="token string">'com.github.Drabu:SSNInputView:Tag'</span>
	<span class="token punctuation">}</span>
</code></pre>
                        </div>
                        
						<div role="tabpanel" class="tab-pane depTab maven">
							<pre class="kode code-toolbar  language-markup"><code id="depCode" class="kode  language-markup">	<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>dependency</span><span class="token punctuation">&gt;</span></span>
	    <span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>groupId</span><span class="token punctuation">&gt;</span></span>com.github.Drabu<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>groupId</span><span class="token punctuation">&gt;</span></span>
	    <span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>artifactId</span><span class="token punctuation">&gt;</span></span>SSNInputView<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>artifactId</span><span class="token punctuation">&gt;</span></span>
	    <span class="token tag"><span class="token tag"><span class="token punctuation">&lt;</span>version</span><span class="token punctuation">&gt;</span></span>Tag<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>version</span><span class="token punctuation">&gt;</span></span>
	<span class="token tag"><span class="token tag"><span class="token punctuation">&lt;/</span>dependency</span><span class="token punctuation">&gt;</span></span>
</code></pre>
						</div>

						<div role="tabpanel" class="tab-pane depTab sbt">
                            <pre class="kode code-toolbar  language-css"><code id="depCodeSbt" class="kode  language-css">	
	libraryDependencies += <span class="token string">"com.github.Drabu"</span> % <span class="token string">"SSNInputView"</span> % <span class="token string">"Tag"</span>	
</code></pre>
                        </div>
                        
                        <div role="tabpanel" class="tab-pane depTab lein">
                            <pre class="kode code-toolbar  language-css"><code id="depCodeLein" class="kode  language-css">	
	<span class="token punctuation">:</span>dependencies [[com.github.Drabu/SSNInputView <span class="token string">"Tag"</span>]]	
</code></pre>
                        </div>
					</div>
				</div>
			</div>
</div>

	</div>
</div>
