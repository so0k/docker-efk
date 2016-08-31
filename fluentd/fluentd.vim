" Vim Syntax file
" Language: fluentd(fluent.conf)
" Maintainer: Hirokazu YOSHIDA
" Last Change: 2012-08-31
" Version: 0.0.1

if exists("b:current_syntax")
  finish
endif
let s:cpo_save = &cpo
set cpo&vim

setlocal iskeyword+=:
syn case ignore

syntax include @Html syntax/html.vim

syn match fluentdPlutinTag +<+ contains=@Html
syn match fluentdComment +#.*+

syn keyword pluginDirective source match store server
syn keyword includeDirective include

syn keyword Command type path time_format port

syn keyword inputPluginCommand pos_file
syn keyword inputPluginCommandHttp bind body_size_limit keepalive_timeout
syn keyword inputPluginCommandTail tag format rotate_wait
syn keyword inputPluginCommandExec command keys tag_key run_interval

syn keyword outputBufferedPluginCommandFile time_slice_format time_slice_wait utc compress
syn keyword outputBufferedPluginCommandForward name host weight send_timeout recover_wait heartbeat_interval phi_threshold hard_timeout
syn keyword outputBufferedPluginCommandExec time_format

syn keyword outputNonBufferedPluginCommand copy roundrobin stdout null

syn keyword bufferPluginCommand buffer_type buffer_path

hi link pluginDirective Define
hi link includeDirective Define
hi link Command Identifier
hi link inputPluginCommand Identifier
hi link inputPluginCommandHttp Identifier
hi link inputPluginCommandTail Identifier
hi link inputPluginCommandExec Identifier
hi link outputBufferedPluginCommandFile Identifier
hi link outputBufferedPluginCommandForward Identifier
hi link outputBufferedPluginCommandExec Identifier
hi link outputNonBufferedPluginCommand Identifier
hi link bufferPluginCommand Identifier

hi link fluentdComment Comment

let b:current_syntax="fluentd"

let &cpo = s:cpo_save
unlet s:cpo_save
