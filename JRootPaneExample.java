<!DOCTYPE html>
<!-- saved from url=(0041)https://www.javatpoint.com/java-jrootpane -->
<html lang="en"><head><meta http-equiv="Content-Type" content="text/html; charset=windows-1252"><script type="text/javascript" async="" src="./JRootPaneExample_files/publishertag.prebid.js.download"></script><script type="text/javascript" async="" src="./JRootPaneExample_files/bbplayer.js.download"></script><script async="" src="./JRootPaneExample_files/async-ads.js.download"></script><script async="" src="./JRootPaneExample_files/async-ads.js.download"></script><script src="./JRootPaneExample_files/osd.js.download"></script><script src="./JRootPaneExample_files/f(4).txt"></script><script type="text/javascript">!function(){"use strict";var n=function(t,e){return(n=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(t,e){t.__proto__=e}||function(t,e){for(var i in e)e.hasOwnProperty(i)&&(t[i]=e[i])})(t,e)};function t(t,e){function i(){this.constructor=t}n(t,e),t.prototype=null===e?Object.create(e):(i.prototype=e.prototype,new i)}var _=function(){return(_=Object.assign||function(t){for(var e,i=1,n=arguments.length;i<n;i++)for(var o in e=arguments[i])Object.prototype.hasOwnProperty.call(e,o)&&(t[o]=e[o]);return t}).apply(this,arguments)};var i=(o.prototype.isAdBlocked=function(t){var e=this;this.createPixel(o.allowedPixelUrl,function(){(e.allowedPixelLoaded=!0)===e.blockedPixelFailed&&t(!0)},function(){}),this.createPixel(o.blockedPixelUrl,function(){t(!1)},function(){(e.blockedPixelFailed=!0)===e.allowedPixelLoaded&&t(!0)})},o.prototype.createPixel=function(t,e,i){var n=document.createElement("img");n.src=t,n.height=1,n.width=1,n.style.display="none",n.onload=e,n.onerror=i},o.allowedPixelUrl="https://static.criteo.net/images/pixel.gif?ch=1",o.blockedPixelUrl="https://static.criteo.net/images/pixel.gif?ch=2",o);function o(){this.allowedPixelLoaded=!1,this.blockedPixelFailed=!1}var T=(e.create=function(t){return new e(t)},e.prototype.adBlockFlagEnabled=function(){var t=e.ADBLOCK_FLAG_KEY;return null!==this.localStorageHelper.getItem(t)},e.prototype.enableAdBlockFlag=function(){var t=e.ADBLOCK_FLAG_KEY;this.localStorageHelper.setItem(t,"1",e.ADBLOCK_FLAG_LIFETIME)},e.prototype.disableAdBlockFlag=function(){var t=e.ADBLOCK_FLAG_KEY;this.localStorageHelper.removeItem(t)},e.prototype.setAdBlockFlagTimer=function(t){var e=this;this.adBlockFlagEnabled()||!this.timerEnabled||this.timerStarted||(this.timerStarted=!0,setTimeout(function(){e.timerEnabled&&(e.refreshAdblockFlag(),e.timerEnabled=!1)},t))},e.prototype.disableAdBlockFlagTimer=function(){this.timerEnabled=!1,this.adBlockFlagEnabled()&&this.refreshAdblockFlag()},e.prototype.refreshAdblockFlag=function(){var e=this;(new i).isAdBlocked(function(t){t?e.enableAdBlockFlag():e.disableAdBlockFlag()})},e.ADBLOCK_FLAG_KEY="criteo_adblock_flag",e.ADBLOCK_FLAG_LIFETIME=864e5,e);function e(t){this.timerEnabled=!0,this.timerStarted=!1,this.localStorageHelper=t}var r,c,s,A=(t(a,r=function(){}),a.prototype.ResizeFrame=function(t,e){if(this.document.defaultView&&this.document.defaultView.frameElement){var i=this.document.defaultView.frameElement;i.width=t.toString(),i.height=e.toString()}},a.prototype.Write=function(t){this.document.open(),this.document.write(t),this.document.close()},a.prototype.LoadScript=function(t){this.Write("<script type='text/javascript' src='"+t+"'><\/script>")},a);function a(t){var e=r.call(this)||this;return e.document=t,e}(s=c=c||{})[s.Error=0]="Error",s[s.Warning=1]="Warning",s[s.Debug=2]="Debug";var d=["color: #fff;","background: #ff8f1c;","display: inline-block;","padding: 1px 4px;","border-radius: 3px;"].join(" "),R=(l.Log=function(t,e){if(!(l.LOGLEVEL<t)){var i=c[t].toUpperCase(),n=window.navigator.userAgent,o=0<n.indexOf("MSIE ")||0<n.indexOf("Trident/");window.console&&(o?console.log("[PubTag] "+i+": "+e):console.log("%cPubTag",d,i+": "+e))}},l.Debug=function(t){l.Log(c.Debug,t)},l.Warning=function(t){l.Log(c.Warning,t)},l.Error=function(t){l.Log(c.Error,t)},l.LOGLEVEL=c.Error,l);function l(){}var M=(u.prototype.filterNoBidSlots=function(t){var e=this.bidManager.filterNoBidSlots(t);return this.context.shouldIgnoreSilentMode?(e.length!==t.length&&this.context.setSilentModeIgnored&&this.context.setSilentModeIgnored(),t):e},u.prototype.silentModeEnabled=function(){var t=!1;return this.silentModeManager.silentModeEnabled()&&(this.context.shouldIgnoreSilentMode&&this.context.setSilentModeIgnored?this.context.setSilentModeIgnored():t=!0),t},u.prototype.getCachedBids=function(t){return this.bidManager.getRequestCachedBids(t)},u.prototype.removeBid=function(t){this.bidManager.removeBid(t)},u.prototype.handleResponse=function(t,e,i,n){var o=i.time_to_next_call;0<o&&(R.Debug("Global silent mode enabled for "+o+" seconds"),this.silentModeManager.enableSilentMode(1e3*o));var r={};if(i.slots)for(var s=0,a=i.slots;s<a.length;s++)(g=a[s]).ttl&&(r[g.imp_id]=g.ttl);var d=[];if(e.slots)for(var c=0,l=e.slots;c<l.length;c++){var u=0;(g=l[c]).slotid in r&&(u=r[g.slotid],delete r[g.slotid]),0<u&&(R.Debug("Bid for slot '"+g.impid+"' cached for "+u+" seconds"),d.push({slot:g,ttl:u}))}this.bidManager.storeResponseBids(d);var p=[];for(var h in r)if(r.hasOwnProperty(h))for(var v=0,f=t;v<f.length;v++){var g;(g=f[v]).slotId===h&&(u=r[h],R.Debug("Silent mode for slot '"+g.impId+"' enabled for "+u+" seconds"),p.push({slot:g,ttl:u}))}this.bidManager.storeRequestNoBids(p)},u.prototype.clearExpiredItems=function(){var t=this;setTimeout(function(){t.bidManager.clearExpiredItems()},3e3)},u);function u(t,e,i){this.silentModeManager=t,this.bidManager=e,this.context=i}var p=(h.prototype.eval=function(t){},h);function h(t){this.name=t}var v,f=(t(g,v=p),g.prototype.eval=function(t){this.callback&&this.callback.apply(this)},g.NAME="genericEvent",g);function g(t){var e=v.call(this,g.NAME)||this;return e.callback=t,e}var m=(y.prototype.generateRandomId=function(){return Math.random().toString(36).replace(/[^a-z]+/g,"").substr(0,6)},y);function y(t,e,i,n,o,r,s){this.id=this.generateRandomId(),this.slotId=t,this.impressionId=e,this.cpm=i,this.width=n,this.height=o,this.zoneId=r,this.dealCode=s}var C,x=(t(E,C=m),E.prototype.GenerateEvent=function(t){var e=this;return t.ResizeFrame(this.width,this.height),new f(function(){return t.LoadScript(e.displayUrl)})},E.prototype.GenerateMessage=function(){return{displayUrl:this.displayUrl}},E);function E(t,e,i,n,o,r,s,a){var d=C.call(this,t,e,i,n,o,r,a)||this;return d.displayUrl=s,d}var w,P=(t(b,w=m),b.prototype.GenerateEvent=function(t){var e=this;return t.ResizeFrame(this.width,this.height),new f(function(){return t.Write(e.creative)})},b.prototype.GenerateMessage=function(){return{creative:this.creative}},b);function b(t,e,i,n,o,r,s,a){var d=w.call(this,t,e,i,n,o,r,a)||this;return d.creative=s,d}var I,D=(t(S,I=m),S.prototype.GenerateEvent=function(t){var e=this;return"function"!=typeof this.nativeCallback?(R.Error("'nativeCallback' parameter is not a function in placements object"),new f(void 0)):"object"!=typeof this.nativePayload?(R.Error("'nativePayload' parameter is not an object in placements object"),new f(void 0)):new f(function(){return e.nativeCallback(e.nativePayload)})},S.prototype.GenerateMessage=function(){return{nativePayload:this.nativePayload}},S);function S(t,e,i,n,o,r,s,a,d){var c=I.call(this,t,e,i,n,o,r,d)||this;return c.nativeCallback=s,c.nativePayload=a,c}var O=101,B=function(t,e,i,n,o,r,s,a,d,c,l,u,p,h,v,f){this.publisherTagVersion=t,this.slots=e,this.elapsed=i,this.isTimeout=n,this.adapterStartElapsed=o,this.cdbCallStartElapsed=r,this.cdbCallEndElapsed=s,this.adapterEndElapsed=a,this.adapterTimeout=d,this.adapterIsTimeout=c,this.timeToFirstByte=l,this.id=u,this.silentModeRequestCount=p,this.localStorageKeyCount=h,this.connectionEstablishmentTime=v,this.domainLookupTime=f},k=function(t,e,i,n,o){this.impressionId=t,this.zoneId=e,this.adUnitId=i,this.cachedBidUsed=n,this.isDsc=o},F=(U.prototype.getMetricsManager=function(){return this.metricsManager},U.prototype.withElapsed=function(t){return this.elapsed=Math.round(t),this},U.prototype.withIsTimeout=function(t){return(this.isTimeout=t)&&this.events.push({eventId:"CdbCallTimeout"}),this},U.prototype.withAdapterStartElapsed=function(t){return this.adapterStartElapsed=Math.round(t),this.events.push({eventId:"AdapterBidStart",elapsed:this.adapterStartElapsed}),this},U.prototype.withCdbCallStartElapsed=function(t){return this.cdbCallStartElapsed=Math.round(t),this.events.push({eventId:"CdbCallStart",elapsed:this.cdbCallStartElapsed}),this},U.prototype.withCdbCallEndElapsed=function(t){return this.cdbCallEndElapsed=Math.round(t),this.events.push({eventId:"CdbCallEnd",elapsed:this.cdbCallEndElapsed}),this},U.prototype.withAdapterEndElapsed=function(t){return this.adapterEndElapsed=Math.round(t),this.events.push({eventId:"AdapterBidEnd",elapsed:this.adapterEndElapsed}),this},U.prototype.withAdapterTimeout=function(t){return this.adapterTimeout=t&&Math.round(t),this},U.prototype.withSlotIdsMatchedByCache=function(t){return 0<(this.slotIdsMatchedByCache=t).length&&this.events.push({eventId:"CachedBidUsed",slots:this.slotIdsMatchedByCache}),this},U.prototype.withTimeToFirstByte=function(t){return this.timeToFirstByte=t&&Math.round(t),this.timeToFirstByte&&this.events.push({eventId:"TimeToFirstByte",elapsed:this.timeToFirstByte}),this},U.prototype.withConnectionEstablishmentTime=function(t){return this.connectionEstablishmentTime=t&&Math.round(t),this.connectionEstablishmentTime&&this.events.push({eventId:"TcpConnectionElapsedTime",elapsed:this.connectionEstablishmentTime}),this},U.prototype.withDomainLookupTime=function(t){return this.domainLookupTime=t&&Math.round(t),this.domainLookupTime&&this.events.push({eventId:"DomainLookupElapsedTime",elapsed:this.domainLookupTime}),this},U.prototype.withUserPreviousTimestamp=function(t){return t&&this.events.push({eventId:"UserReturnTime",elapsed:(new Date).getTime()-t}),this},U.prototype.addSlot=function(e,t,i,n){var o=0<this.slotIdsMatchedByCache.filter(function(t){return t===e}).length;return this.slots.push(new k(e,t,i,o,n)),this},U.prototype.build=function(t){var e;return void 0!==this.adapterTimeout&&(e=this.adapterEndElapsed>this.adapterTimeout),new B(O,this.slots,this.elapsed,this.isTimeout,this.adapterStartElapsed,this.cdbCallStartElapsed,this.cdbCallEndElapsed,this.adapterEndElapsed,this.adapterTimeout,e,this.timeToFirstByte,t,this.metricsManager.getSilentModeRequestCount(!0),this.metricsManager.getLocalStorageKeyCount(),this.connectionEstablishmentTime,this.domainLookupTime)},U.prototype.buildEvents=function(t){if(this.events.length){var e={requestId:t,events:this.events};return void 0!==this.adapterTimeout&&this.adapterEndElapsed>this.adapterTimeout&&e.events.push({eventId:"AdapterTimeout"}),e}},U.prototype.clear=function(){this.events=[]},U);function U(t){this.elapsed=0,this.isTimeout=!1,this.adapterStartElapsed=0,this.cdbCallStartElapsed=0,this.cdbCallEndElapsed=0,this.adapterEndElapsed=0,this.slotIdsMatchedByCache=[],this.slots=[],this.events=[],this.metricsManager=t}function N(t){try{return JSON.parse(t)}catch(t){return}}var L,q,H=(W.generateCacheBuster=function(){return Math.floor(99999999999*Math.random())},W);function W(){}function K(t){switch(t.toLowerCase()){case"amp":return L.AMP;default:return L.Unspecified}}(q=L=L||{})[q.Unspecified=0]="Unspecified",q[q.AMP=1]="AMP";var z=(G.prototype.buildUrl=function(t,e,i,n,o){void 0===i&&(i=L.Unspecified);var r=G.CRITEO_BIDDER_URL+this.getHandlerPath();return r+="?ptv="+O,!0===e.isAdBlocked&&(r+="&abp=1"),r=this.appendCommonParameters(r,t,n,o),r+=e.ctoIdOnPublisherDomain?"&idcpy="+e.ctoIdOnPublisherDomain:"",r+=e.secureId?"&sid="+e.secureId:"",r+=e.isOptOut?"&optout=1":"",r+=e.bundle?"&bundle="+e.bundle:"",i!==L.Unspecified&&(r+="&im="+i),r+=e.silentModeIgnored?"&smi=1":"",r+="&cb="+String(H.generateCacheBuster()),r+=e.getContextFlags()},G.prototype.buildCsmUrl=function(t,e,i){var n=G.CRITEO_BIDDER_URL+G.CRITEO_CSM_HANDLER;return n+="?ptv="+O,this.appendCommonParameters(n,t,e,i)},G.prototype.buildErrorUrl=function(){return G.CRITEO_BIDDER_URL+G.CRITEO_ERROR_HANDLER},G.prototype.buildCsmEventsUrl=function(){return G.CRITEO_BIDDER_URL+G.CRITEO_CSM_EVENTS_HANDLER},G.prototype.buildCsmCountersUrl=function(){return G.CRITEO_BIDDER_URL+G.CRITEO_CSM_COUNTERS_HANDLER},G.prototype.appendCommonParameters=function(t,e,i,n){return t+="&profileId="+String(e),void 0!==i&&(t+="&av="+String(i)),void 0!==n&&(t+="&wv="+encodeURIComponent(n)),t},G.prototype.getHandlerPath=function(){return this.auditMode?G.CRITEO_BIDDER_AUDIT_HANDLER:G.CRITEO_BIDDER_HANDLER},G.CRITEO_BIDDER_URL="https://bidder.criteo.com/",G.CRITEO_BIDDER_HANDLER="cdb",G.CRITEO_CSM_HANDLER="csm",G.CRITEO_CSM_EVENTS_HANDLER="csm/events",G.CRITEO_CSM_COUNTERS_HANDLER="csm/counters",G.CRITEO_ERROR_HANDLER="error",G.CRITEO_BIDDER_AUDIT_HANDLER="prebid/audit",G);function G(t){void 0===t&&(t=!1),this.auditMode=t}var V=(j.prototype.getManagerMetrics=function(){var t=this.localStorageHelper.getItem(j.MANAGER_METRICS_STORAGE_KEY);if(null==t)return{};var e=N(t);return void 0===e?{}:e},j.prototype.setManagerMetrics=function(t){this.localStorageHelper.setItem(j.MANAGER_METRICS_STORAGE_KEY,JSON.stringify(t))},j.prototype.getSilentModeRequestCount=function(t){void 0===t&&(t=!1);var e=this.getManagerMetrics().silentModeRequestCount;return t&&this.resetSilentModeRequestCount(),isNaN(e)?0:e},j.prototype.incSilentModeRequestCount=function(){var t=this.getManagerMetrics();t.silentModeRequestCount=isNaN(t.silentModeRequestCount)?1:t.silentModeRequestCount+1,this.setManagerMetrics(t)},j.prototype.resetSilentModeRequestCount=function(){var t=this.getManagerMetrics();t.silentModeRequestCount=0,this.setManagerMetrics(t)},j.prototype.getLocalStorageKeyCount=function(){return this.localStorageHelper.getAllItemsByPrefix("criteo_").length+this.localStorageHelper.getAllItemsByPrefix("cto_").length},j.prototype.getPreviousBuildRequestTimestamp=function(){var t=this.getManagerMetrics().previousBuildRequestTimestamp;return isNaN(t)?void 0:t},j.prototype.resetPreviousBuildRequestTimestamp=function(){var t=this.getManagerMetrics();t.previousBuildRequestTimestamp=(new Date).getTime().toString(),this.setManagerMetrics(t)},j.prototype.sendMetric=function(t,e){var i={feedbacks:[t.build(e)]},n=this.urlBuilder.buildCsmUrl(this.profileId,this.adapterVersion,this.wrapperVersion),o=JSON.stringify(i);navigator.sendBeacon&&navigator.sendBeacon(n,o)},j.prototype.sendEvents=function(t,e,i){void 0===i&&(i=!1);var n=this.urlBuilder.buildCsmEventsUrl();i&&(t.withUserPreviousTimestamp(this.getPreviousBuildRequestTimestamp()),this.resetPreviousBuildRequestTimestamp());var o=t.buildEvents(e);t.clear(),navigator.sendBeacon&&o&&navigator.sendBeacon(n,JSON.stringify(o))},j.MANAGER_METRICS_STORAGE_KEY="criteo_pt_cdb_mngr_metrics",j);function j(t,e,i,n){this.urlBuilder=new z,this.profileId=e,this.adapterVersion=i,this.wrapperVersion=n,this.localStorageHelper=t}var Y=(J.tryInsertPlaceholder=function(t,e,i){var n=document.getElementById(t);if(null===n)return R.Warning("Unable to insert ad placeholder : impression id "+t+" not found."),!1;if(n.appendChild(this.createPlaceholder()),!e&&this.isVisible(n))return!0;this.removePlaceholder(t,i);var o=n.parentElement;if(null===o)return!1;var r=this.createClone(n);return o.insertBefore(r,n),r.appendChild(this.createPlaceholder()),this.isVisible(r)?(i[t]=r,!0):(R.Warning("Ad placeholder created but not visible : can't render."),o.removeChild(r),!1)},J.isVisible=function(t){return 0!==t.offsetWidth&&0!==t.offsetHeight&&0!==t.getClientRects().length},J.createClone=function(t){var e=t.cloneNode(!1);return e.id=this.generateRandomId(),e.className="","none"===e.style.display&&e.style.removeProperty("display"),"SPAN"===e.tagName&&(e.style.display="block"),t.style.display="none",e},J.generateRandomId=function(){for(var t="1234567890abcdefghijklmnopqrstuvwxyz",e="",i=0;i<20;i++){var n=Math.floor(Math.random()*t.length);e+=t.charAt(n)}return e},J.createPlaceholder=function(){var t=document.createElement("div");return t.style.width="1px",t.style.height="1px",t.style.display="block",t.className=J.PLACEHOLDER_NAME,t},J.removePlaceholder=function(t,e){var i=e[t];void 0!==i&&null!==i.parentNode&&i.parentNode.removeChild(i);var n=document.getElementById(t);if(null!==n)for(var o=0,r=n.getElementsByClassName(J.PLACEHOLDER_NAME);o<r.length;o++){var s=r[o];null!==s.parentNode&&s.parentNode.removeChild(s)}},J.insertAdIFrame=function(t,e){var i,n=e[t];if(void 0!==n)i=n;else{var o=document.getElementById(t);if(null===o)return null;i=o}for(var r=0,s=i.getElementsByClassName(J.PLACEHOLDER_NAME);r<s.length;r++){for(var a=s[r],d=0,c=a.childNodes;d<c.length;d++){var l=c[d];null!==l.parentNode&&l.parentNode.removeChild(l)}var u=this.createAdIFrame();return a.appendChild(u),a.style.width="",a.style.height="",a.style.display="",u}return null},J.createAdIFrame=function(){var t=document.createElement("iframe");return t.scrolling="no",t.marginWidth="0",t.marginHeight="0",t.frameBorder="0",t.style.border="0",t.style.verticalAlign="bottom",t},J.removePlaceholders=function(t,e,i){for(var n=0,o=t;n<o.length;n++){var r=o[n].impId;-1===e.indexOf(r)&&J.removePlaceholder(r,i)}},J.tryInsertPlaceholders=function(t,e,i){for(var n=[],o=0,r=t;o<r.length;o++){var s=r[o],a=s.impId;J.tryInsertPlaceholder(a,e,i)&&n.push(s)}return n},J.PLACEHOLDER_NAME="criteo_placeholder",J);function J(){}var X=(Z.prototype.isValid=function(){return 0<this.slots.length},Z.prototype.getRequest=function(){for(var t=[],e=0,i=this.slots;e<i.length;e++){var n=i[e],o={slotid:n.slotId,impid:n.impId};if(void 0!==n.zoneId&&(o.zoneid=n.zoneId),void 0!==n.nativeCallback&&(o.native=!0),void 0!==n.transactionId&&(o.transactionid=n.transactionId),void 0!==n.publisherSubId&&(o.publishersubid=n.publisherSubId),void 0!==n.sizes){for(var r=[],s=0,a=n.sizes;s<a.length;s++){var d=a[s];r.push(d.width+"x"+d.height)}o.sizes=r}if(void 0!==n.video){var c={playersizes:this.parsePlayerSizes(n.video.playersize),mimes:n.video.mimes,protocols:n.video.protocols,maxduration:n.video.maxduration,api:n.video.api,skip:n.video.skip,placement:n.video.placement,playbackmethod:n.video.playbackmethod,minduration:n.video.minduration,startdelay:n.video.startdelay};o.video=c}if(void 0!==this.viewportComputer){var l=this.viewportComputer.getSlotPosition(n);void 0!==l&&(o.position={top:l.top,left:l.left})}void 0!==n.ext&&(o.ext=n.ext),t.push(o)}var u={ceh:this.context.ceh,uspOptout:this.context.ccpaOptout,ext:this.context.getUserExtWithContextualData()},p={publisher:{url:this.context.highestAccessibleUrl,ext:this.context.getPublisherExt()},slots:t,user:u};if(void 0!==this.networkId&&(p.publisher.networkid=this.networkId),this.privacyWrapper&&(this.privacyWrapper.gdprConsent&&(p.gdprConsent=this.privacyWrapper.gdprConsent),this.privacyWrapper.ccpaIabConsent&&(u.uspIab=this.privacyWrapper.ccpaIabConsent.uspString)),void 0!==this.viewportComputer){var h=this.viewportComputer.getViewport();p.viewport={width:h.width,height:h.height,scrollTop:h.scrollTop,scrollLeft:h.scrollLeft}}return void 0!==this.adapterTimeout&&(p.tmax=this.adapterTimeout),void 0!==this.auctionStart&&(p.auctionStart=this.auctionStart),void 0!==this.clientRequestId&&(p.id=this.clientRequestId),void 0!==this.userIds&&(p.eids=this.userIds),p},Z.parsePlayerSize=function(t){return t[0]+"x"+t[1]},Z.prototype.parsePlayerSizes=function(t){return Array.isArray(t[0])?t.map(function(t){return Z.parsePlayerSize(t)}):[Z.parsePlayerSize(t)]},Z.prototype.getUrl=function(){return this.urlBuilder.buildUrl(this.profileId,this.context,this.integrationMode,this.adapterVersion,this.wrapperVersion)},Z);function Z(t,e,i,n,o,r,s,a,d,c,l,u,p,h){this.slots=t,this.context=e,this.urlBuilder=i,this.profileId=n,this.integrationMode=o||L.Unspecified,this.networkId=r,this.adapterVersion=s,this.privacyWrapper=a,this.wrapperVersion=d,this.viewportComputer=c,this.adapterTimeout=l,this.clientRequestId=u,this.userIds=p,this.auctionStart=h}function Q(t){var e={slots:void 0,time_to_next_call:0};return void 0!==t.exd&&(void 0!==t.exd.time_to_next_call&&(e.time_to_next_call=t.exd.time_to_next_call),e.slots=t.exd.slots,delete t.exd),e}function $(){var i=(new Date).getTime();return"undefined"!=typeof performance&&"function"==typeof performance.now&&(i+=performance.now()),"xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx".replace(/[xy]/g,function(t){var e=(i+16*Math.random())%16|0;return i=Math.floor(i/16),("x"===t?e:3&e|8).toString(16)})}var tt=function(t,e,i,n,o,r,s,a,d){this.slotId=$().replace(/-/g,""),this.impId=t,this.zoneId=e,this.nativeCallback=i,this.transactionId=n,this.sizes=o,this.publisherSubId=r,this.mediaTypes=s,this.video=a,this.ext=d},et=function(t,e,i,n,o,r,s,a,d,c){this.playersize=t,this.mimes=e,this.protocols=i,this.maxduration=n,this.api=o,this.skip=r,this.placement=s,this.playbackmethod=a,this.minduration=d,this.startdelay=c},it=(nt.CreateRunning=function(){var t=new nt;return t.start(),t},nt.CreateWithStartTime=function(t){var e=new nt(!1);return e.startTime=t,e},nt.TimeSincePageLoad=function(){if(window.performance){if(window.performance.now)return window.performance.now();if(window.performance.timing&&window.performance.timing.navigationStart)return(new Date).getTime()-performance.timing.navigationStart}return 0},nt.prototype.start=function(){this.startTime=this.now()},nt.prototype.elapsed=function(){return this.now()-this.startTime},nt);function nt(t){void 0===t&&(t=!0),t&&window.performance&&window.performance.now?this.now=window.performance.now.bind(window.performance):Date.now?this.now=Date.now:this.now=function(){return(new Date).getTime()}}var ot=(rt.prototype.sendRequest=function(t){this.url=t,this.sendTime=it.CreateRunning(),this.builder.withCdbCallStartElapsed(this.timer.elapsed())},rt.prototype.requestReceived=function(t){void 0===t&&(t=!1),this.builder.withElapsed(function(t){if(window.performance&&window.performance.getEntries)for(var e=window.performance.getEntries(),i=e.length-1;0<=i;--i){var n=e[i];if(n.name===t&&n.duration)return Math.round(n.duration)}}(this.url)||this.sendTime.elapsed()),this.builder.withCdbCallEndElapsed(this.timer.elapsed()),this.builder.withIsTimeout(t)},rt.prototype.finish=function(t){if(this.builder.withAdapterEndElapsed(this.timer.elapsed()),t&&0!==t.length)for(var e=0,i=t;e<i.length;e++){var n=i[e];this.builder.addSlot(n.imp_id,n.zone_id,n.ad_unit_id,n.is_dsc)}else this.builder.addSlot("");var o=rt.getLastCdbTiming();void 0!==o&&(this.builder.withTimeToFirstByte(rt.computeTimeToFirstByte(o)),this.builder.withConnectionEstablishmentTime(rt.computeConnectionEstablishmentTime(o)),this.builder.withDomainLookupTime(rt.computeDomainLookupTime(o)))},rt.getLastCdbTiming=function(){if(void 0!==window.performance&&void 0!==window.performance.getEntriesByType&&"function"==typeof window.performance.getEntriesByType){var t=window.performance.getEntriesByType("resource");if(void 0!==t){var e=t.filter(function(t){return 0<=t.name.indexOf("cdb")});return void 0!==e&&0<e.length?e[e.length-1]:void 0}}},rt.computeTimeToFirstByte=function(t){var e=t.responseStart,i=t.requestStart;if(void 0!==e&&void 0!==i)return e-i},rt.computeConnectionEstablishmentTime=function(t){var e=t.connectEnd-t.connectStart;return isNaN(e)?void 0:e},rt.computeDomainLookupTime=function(t){var e=t.domainLookupEnd-t.domainLookupStart;return isNaN(e)?void 0:e},rt);function rt(t,e,i){this.builder=t,this.timer=void 0!==e?it.CreateWithStartTime(e):it.CreateRunning();var n=this.timer.elapsed();this.builder.withAdapterStartElapsed(n),void 0!==i&&this.builder.withAdapterTimeout(i)}var st=(at.prototype.toString=function(){return this.width+"x"+this.height},at);function at(t,e){this.width=t,this.height=e}function dt(t){var e="number"==typeof window.PREBID_TIMEOUT?window.PREBID_TIMEOUT:void 0;return t&&e?Math.min(t,e):t||e||void 0}var ct=function(t,e){this.top=t,this.left=e},lt=function(t,e,i,n){this.width=t,this.height=e,this.scrollTop=i,this.scrollLeft=n},ut=(pt.getHighestAccessibleWindow=function(t){var e=t,i=!1;try{for(;e.parent.document!==e.document;){if(!e.parent.document){i=!0;break}e=e.parent}}catch(t){i=!0}return{topFrame:e,err:i}},pt.getHighestAccessibleUrl=function(t){var e=t.topFrame;if(!t.err)return e.location.href;try{var i=e.top.location.href;if(i)return i}catch(t){}try{var n=e.location.ancestorOrigins;if(n)return n[n.length-1]}catch(t){}return e.document.referrer},pt.inIframe=function(){try{return window.self!==window.top}catch(t){return!0}},pt);function pt(){}var ht=(vt.prototype.getViewport=function(){var t=ut.getHighestAccessibleWindow(window).topFrame,e=t.document,i=t.innerWidth||e.documentElement.clientWidth,n=t.innerHeight||e.documentElement.clientHeight,o=e.documentElement.scrollTop||e.body&&e.body.scrollTop||0,r=e.documentElement.scrollLeft||e.body&&e.body.scrollLeft||0;return new lt(i,n,o,r)},vt.prototype.getSlotPosition=function(t){var e=t.impId,i=document.getElementById(e);if(null!==i){var n=i.getBoundingClientRect();return new ct(n.top,n.left)}},vt);function vt(){}var ft=(gt.prototype.checkLocalStorage=function(t){if(!this.localStorage)return!1;var e=this.CHECK_STORAGE_KEY;try{return this.localStorage.setItem(e,e),this.localStorage.removeItem(e),!!this.checkTcfPurposeOne(t)||(R.Debug("Purpose One not granted"),!1)}catch(t){return!1}},gt.prototype.checkTcfPurposeOne=function(t){return!t||!t.purposes||!0===t.purposes[1]},gt.prototype.removeItem=function(t){this.localStorageEnabled&&(this.localStorage.removeItem(t),this.localStorage.removeItem(t+this.EXPIRE_SUFFIX))},gt.prototype.getItem=function(t,e){if(!this.localStorageEnabled)return null;var i=(new Date).getTime(),n=this.localStorage.getItem(t+this.EXPIRE_SUFFIX),o=n?parseInt(n,10):-1;return-1!==o&&o<i||e&&(-1===o||e<o-i)?(this.removeItem(t),null):this.localStorage.getItem(t)},gt.prototype.setItem=function(t,e,i){if(this.localStorageEnabled)try{if(this.localStorage.setItem(t,e),i){var n=(new Date).getTime()+i;this.localStorage.setItem(t+this.EXPIRE_SUFFIX,n.toString())}}catch(t){}},gt.prototype.getAllItemsByPrefix=function(t){var e=[];if(this.localStorageEnabled)for(var i in localStorage)0===i.indexOf(t)&&e.push(i);return e},gt);function gt(t,e){this.EXPIRE_SUFFIX="_expires",this.CHECK_STORAGE_KEY="criteo_localstorage_check",this.localStorage=function(t){try{return t.localStorage}catch(t){return}}(t||window),this.localStorageEnabled=this.checkLocalStorage(e)}var mt=(yt.prototype.silentModeEnabled=function(){var t=yt.SILENT_MODE_KEY;return null!==this.localStorageHelper.getItem(t)},yt.prototype.enableSilentMode=function(t){var e=yt.SILENT_MODE_KEY;this.localStorageHelper.setItem(e,"1",t)},yt.SILENT_MODE_KEY="criteo_silent_mode",yt);function yt(t){this.localStorageHelper=t}function Ct(){return(new Date).getTime()}var Et=(wt.prototype.toString=function(){return"ImpId"+this.impressionId},wt);function wt(t){this.impressionId=t}var bt,It=(t(St,bt=Et),St.prototype.toString=function(){return bt.prototype.toString.call(this)+"_Size"+this.size+"_NetworkId"+this.networkId},St);function St(t,e,i){var n=bt.call(this,t)||this;return n.size=e,n.networkId=i,n}var _t,Tt=(t(At,_t=Et),At.prototype.toString=function(){return _t.prototype.toString.call(this)+"_ZoneId"+this.zoneId},At);function At(t,e){var i=_t.call(this,t)||this;return i.zoneId=e,i}var Rt=(Mt.prototype.createKeysFromSlotRequest=function(t){if(this.useZoneIdIntegration)return[new Tt(t.impId,t.zoneId)];for(var e=[],i=0,n=t.sizes;i<n.length;i++){var o=n[i];e.push(new It(t.impId,o,this.networkId))}return e},Mt.prototype.createKeyFromSlotResponse=function(t){return this.useZoneIdIntegration?new Tt(t.impid,t.zoneid):new It(t.impid,new st(t.width,t.height),this.networkId)},Mt.prototype.createKeyFromBid=function(t){return this.useZoneIdIntegration?new Tt(t.impressionId,t.zoneId):new It(t.impressionId,new st(t.width,t.height),this.networkId)},Mt);function Mt(t,e){this.useZoneIdIntegration=t,this.networkId=e}var xt=(Pt.useZoneIdIntegration=function(t,e){return void 0===e||0===t.filter(function(t){return void 0!==t.sizes&&0<t.sizes.length}).length},Pt.prototype.getBySlotKey=function(t,e){var i=e.toString();if(i in t){var n=t[i];if(void 0!==n)return void 0!==n.bid&&void 0!==n.expiration&&n.expiration<Ct()&&(n.bid=void 0,n.expiration=void 0),n}return{}},Pt.prototype.setBySlotKey=function(t,e,i){var n=e.toString();void 0!==i.bid||void 0!==i.expiration&&i.expiration>Ct()?t[n]=i:n in t&&delete t[n]},Pt.prototype.filterNoBidSlots=function(t){for(var e=[],i=this.localStorageHelper.getItem(Pt.BIDCACHE_STORAGE_KEY),n=i&&N(i)||{},o=0,r=t;o<r.length;o++){for(var s=r[o],a=[],d=0,c=this.slotKeyFactory.createKeysFromSlotRequest(s);d<c.length;d++){var l=c[d];this.getBidFromMap(n,l,0)!==Pt.NO_BID&&(l instanceof It?a.push(l.size):e.push(s))}0<a.length&&(s.sizes=a,e.push(s))}return e},Pt.prototype.getRequestCachedBids=function(t,e){void 0===e&&(e=5e3);for(var i={},n=this.localStorageHelper.getItem(Pt.BIDCACHE_STORAGE_KEY),o=n&&N(n)||{},r=0,s=t;r<s.length;r++)for(var a=s[r],d=0,c=this.slotKeyFactory.createKeysFromSlotRequest(a);d<c.length;d++){var l=c[d],u=this.getBidFromMap(o,l,e);void 0!==u&&u!==Pt.NO_BID&&(i[a.slotId]=u)}return this.localStorageHelper.setItem(Pt.BIDCACHE_STORAGE_KEY,JSON.stringify(o)),i},Pt.prototype.getBid=function(t,e){void 0===e&&(e=5e3);var i=this.localStorageHelper.getItem(Pt.BIDCACHE_STORAGE_KEY),n=i&&N(i)||{},o=this.getBidFromMap(n,t,e);return this.localStorageHelper.setItem(Pt.BIDCACHE_STORAGE_KEY,JSON.stringify(n)),o},Pt.prototype.getBidFromMap=function(t,e,i){void 0===i&&(i=5e3);var n=this.getBySlotKey(t,e);return void 0===n.bid&&n.expiration&&n.expiration>Ct()?Pt.NO_BID:0<i&&void 0!==n.bid?(delete t[e.toString()],n.bid):void 0},Pt.prototype.storeResponseBids=function(t){for(var e=this.localStorageHelper.getItem(Pt.BIDCACHE_STORAGE_KEY),n=e&&N(e)||{},i=function(i){var t=o.slotKeyFactory.createKeyFromSlotResponse(i.slot);o.modifyCache(n,t,function(t){var e=Ct()+1e3*i.ttl;(void 0===t.expiration||t.expiration<e)&&(t.bid=i.slot,t.expiration=e)})},o=this,r=0,s=t;r<s.length;r++)i(s[r]);this.localStorageHelper.setItem(Pt.BIDCACHE_STORAGE_KEY,JSON.stringify(n))},Pt.prototype.storeRequestNoBids=function(t){for(var e=this.localStorageHelper.getItem(Pt.BIDCACHE_STORAGE_KEY),o=e&&N(e)||{},i=function(e){for(var t=0,i=r.slotKeyFactory.createKeysFromSlotRequest(e.slot);t<i.length;t++){var n=i[t];r.modifyCache(o,n,function(t){t.bid=void 0,t.expiration=Math.max(t.expiration||0,Ct()+1e3*e.ttl)})}},r=this,n=0,s=t;n<s.length;n++)i(s[n]);this.localStorageHelper.setItem(Pt.BIDCACHE_STORAGE_KEY,JSON.stringify(o))},Pt.prototype.removeBid=function(e){var t=this.localStorageHelper.getItem(Pt.BIDCACHE_STORAGE_KEY),i=t&&N(t)||{},n=this.slotKeyFactory.createKeyFromBid(e);this.modifyCache(i,n,function(t){void 0!==t.bid&&t.bid.slotid===e.slotId&&(t.bid=void 0,t.expiration=void 0)}),this.localStorageHelper.setItem(Pt.BIDCACHE_STORAGE_KEY,JSON.stringify(i))},Pt.prototype.modifyCache=function(t,e,i){var n=this.getBySlotKey(t,e);i(n),this.setBySlotKey(t,e,n)},Pt.prototype.clearExpiredItems=function(){for(var t=this.localStorageHelper.getItem(Pt.BIDCACHE_STORAGE_KEY),e=t&&N(t)||{},i=0,n=Object.keys(e);i<n.length;i++){var o=n[i],r=e[o];void 0!==r&&void 0!==r.expiration&&r.expiration<Ct()&&delete e[o]}this.localStorageHelper.setItem(Pt.BIDCACHE_STORAGE_KEY,JSON.stringify(e))},Pt.NO_BID="nobid",Pt.BIDCACHE_STORAGE_KEY="criteo_pt_cdb_bidcachemap",Pt);function Pt(t,e,i){this.localStorageHelper=t,this.slotKeyFactory=new Rt(e,i)}var Dt,Ot;(Ot=Dt=Dt||{}).Native="native",Ot.Banner="banner",Ot.Video="video";var Bt=(kt.prototype.hasValidNativeParams=function(t){return!(t.nativeParams&&(t.nativeParams.image&&(!0!==t.nativeParams.image.sendId||!0===t.nativeParams.image.sendTargetingKeys)||t.nativeParams.icon&&(!0!==t.nativeParams.icon.sendId||!0===t.nativeParams.icon.sendTargetingKeys)||t.nativeParams.clickUrl&&(!0!==t.nativeParams.clickUrl.sendId||!0===t.nativeParams.clickUrl.sendTargetingKeys)||t.nativeParams.displayUrl&&(!0!==t.nativeParams.displayUrl.sendId||!0===t.nativeParams.displayUrl.sendTargetingKeys)||t.nativeParams.privacyLink&&(!0!==t.nativeParams.privacyLink.sendId||!0===t.nativeParams.privacyLink.sendTargetingKeys)||t.nativeParams.privacyIcon&&(!0!==t.nativeParams.privacyIcon.sendId||!0===t.nativeParams.privacyIcon.sendTargetingKeys)))},kt.prototype.buildCdbUrl=function(){return this.url},kt.prototype.buildCdbRequest=function(){if(this.cache.silentModeEnabled())return R.Debug("Request ignored because the global silent mode is enabled"),void this.metricsManager.incSilentModeRequestCount();if(this.requestBuilder.isValid()){var t=Math.min((this.timeout||5e3)+1e3,5e3);return this.adBlockFlagManager.setAdBlockFlagTimer(t),this.timer.sendRequest(this.url),this.requestBuilder.getRequest()}R.Debug("Request ignored because it doesnt contain any slot")},kt.GetAllAdapters=function(){return window.Criteo.prebid_adapters},kt.GetAdapter=function(t){var e="string"==typeof t?t:t.bidRequests[0].auctionId,i=kt.GetAllAdapters();if(i&&e in i)return i[e]},kt.createCriteoNativeAdWithCallback=function(t,e,i){return window.criteo_prebid_native_slots=window.criteo_prebid_native_slots||{},window.criteo_prebid_native_slots[t]={callback:i,payload:e},'<script type="text/javascript">\n            var win = window;\n            for (var i = 0; i < 10; ++i) {\n                win = win.parent;\n                if (win.criteo_prebid_native_slots) {\n                    var responseSlot = win.criteo_prebid_native_slots["'+t+'"];\n                    responseSlot.callback(responseSlot.payload);\n                    break;\n                }\n            }\n        <\/script>'},kt.createPrebidNativeAd=function(t){return{sendTargetingKeys:!1,title:t.products[0].title,body:t.products[0].description,sponsoredBy:t.advertiser.description,icon:t.advertiser.logo,image:t.products[0].image,clickUrl:t.products[0].click_url,privacyLink:t.privacy.optout_click_url,privacyIcon:t.privacy.optout_image_url,cta:t.products[0].call_to_action,price:t.products[0].price,impressionTrackers:t.impression_pixels.map(function(t){return t.url})}},kt.prototype.getBidRequestForSlot=function(t){for(var e=0,i=this.bidRequests;e<i.length;e++){var n=i[e];if(n.adUnitCode===t.impid&&(!n.params.zoneId||parseInt(n.params.zoneId,10)===t.zoneid))return n}},kt.prototype.getSlotForAdUnitCode=function(t){for(var e=0,i=this.slots;e<i.length;e++){var n=i[e];if(n&&n.impId===t)return n}},kt.getVideoInfoFromBidRequest=function(t){if(kt.hasVideoMediaType(t))return new et(t.mediaTypes.video.playerSize,t.mediaTypes.video.mimes,t.mediaTypes.video.protocols,t.mediaTypes.video.maxduration,t.mediaTypes.video.api,t.params.video.skip,t.params.video.placement,t.params.video.playbackmethod,t.params.video.minduration,t.params.video.startdelay)},kt.hasVideoMediaType=function(t){return void 0!==t.params&&void 0!==t.params.video&&!(void 0===t.mediaTypes||void 0===t.mediaTypes.video)},kt.prototype.interpretResponse=function(t,e){this.timer.requestReceived(),this.adBlockFlagManager.disableAdBlockFlagTimer();var i=Q(t),n={};if(void 0!==i.slots)for(var o=0,r=i.slots;o<r.length;o++)n[(E=r[o]).imp_id]=E;var s,a,d,c,l,u,p,h,v,f,g,m=[];if(t.slots&&Array.isArray(t.slots))for(var y=0,C=t.slots;y<C.length;y++){var E=C[y],w=this.getBidRequestForSlot(E);if(w)if(!0===window.criteo_pubtag.context.isAdBlocked){if(void 0!==(s=E.slotid,a=E.impid,d=E.cpm,c=E.width,l=E.height,u=E.zoneid,p=w.params.nativeCallback,h=E.native,v=E.displayurl,f=E.creative,g=E.deal,T=void 0!==p&&void 0!==h?new D(s,a,d,c,l,u,p,h,g):void 0===v||void 0!==f&&"<script"!==f.substr(0,7)?void 0!==f?new P(s,a,d,c,l,u,f,g):void 0:new x(s,a,d,c,l,u,v,g))&&Y.tryInsertPlaceholder(w.adUnitCode,!0,window.criteo_pubtag.context.cloneByImpressionId)){var b=Y.insertAdIFrame(w.adUnitCode,window.criteo_pubtag.context.cloneByImpressionId);if(null!=b){var I=new A(b.contentDocument);T.GenerateEvent(I).eval(window.criteo_pubtag)}}}else{var S=w.bidId,_=E.ttl||n[E.slotid]&&n[E.slotid].ttl||60,T={requestId:S,adId:$(),cpm:E.cpm,currency:E.currency,netRevenue:!0,ttl:_,creativeId:S,width:E.width,height:E.height,dealId:E.deal};E.native?w.params.nativeCallback?T.ad=kt.createCriteoNativeAdWithCallback(S,E.native,w.params.nativeCallback):(T.native=kt.createPrebidNativeAd(E.native),T.mediaType=Dt.Native):E.video?(T.vastUrl=E.displayurl,T.mediaType=Dt.Video):T.ad=E.creative,m.push(T)}else R.Error("Unable to bid request for slot "+E)}return this.cache.handleResponse(this.slots,t,i,!1),this.timer.finish(i.slots),this.metricsManager.sendEvents(this.metricBuilder,this.clientRequestId,!0),this.cache.clearExpiredItems(),m},kt.prototype.handleBidWon=function(){},kt.prototype.handleBidTimeout=function(){this.timer.requestReceived(!0),this.timer.finish(),this.metricsManager.sendEvents(this.metricBuilder,this.clientRequestId,!0),this.cache.clearExpiredItems()},kt.prototype.handleSetTargeting=function(){},kt.prototype.getBannerSizes=function(t){var e,i;return(null===(i=null===(e=t.mediaTypes)||void 0===e?void 0:e.banner)||void 0===i?void 0:i.sizes)||t.sizes||[]},kt.prototype.getNativeSizes=function(t){var e,i,n;return(null===(n=null===(i=null===(e=t.mediaTypes)||void 0===e?void 0:e.native)||void 0===i?void 0:i.image)||void 0===n?void 0:n.sizes)||[]},kt.prototype.getSizes=function(t){var e,i=this.getBannerSizes(t).map(function(t){return new st(t[0],t[1])}),n=this.getNativeSizes(t).map(function(t){return new st(t[0],t[1])}),o=i.concat(n);return(null===(e=t.mediaTypes)||void 0===e?void 0:e.native)&&(0===o.length?o=[new st(2,2)]:o.forEach(function(t,e,i){void 0===t.height&&void 0===t.width&&(i[e]=new st(2,2))})),o.filter(function(t,e,i){return i.indexOf(t)===e})},kt.prototype.getFloorsForSizes=function(t,o,r){var s={},e=r.getFloor({currency:"USD",size:"*",mediaType:o});if("USD"!==e.currency)throw new Error("Currency for floors is not in USD, or cannot be converted to USD");return s["*"]=e.floor,t.forEach(function(t,e,i){var n=new st(t[0],t[1]);s[n.toString()]=r.getFloor({currency:"USD",size:t,mediaType:o}).floor}),s},kt);function kt(t,e,i,n,o){var r,s,a;this.clientRequestId=$();var d={};n.gdprConsent&&(void 0!==n.gdprConsent.consentString&&(d.consentData=n.gdprConsent.consentString),void 0!==n.gdprConsent.gdprApplies&&(d.gdprApplies=!!n.gdprConsent.gdprApplies),d.version=n.gdprConsent.apiVersion);var c={uspString:n.uspConsent},l=new ft(void 0,d);this.timeout=dt(n.timeout),this.metricsManager=new V(l,t,e,o),this.metricBuilder=new F(this.metricsManager),this.timer=new ot(this.metricBuilder,n.start,this.timeout);var u,p,h=new ht;this.adBlockFlagManager=T.create(l),this.adBlockFlagManager.adBlockFlagEnabled()&&(t=280,window.criteo_pubtag.context.isAdBlocked=!0),this.auctionId=n.auctionId,this.bidRequests=i,this.slots=[];for(var v,f=!0,g=0,m=i;g<m.length;g++){var y=void 0;(b=m[g]).fpd&&b.fpd.context&&(y=b.fpd.context),b.params.ext&&(y=_(_({},y),b.params.ext)),f=this.hasValidNativeParams(b);try{var C={};if(b.getFloor&&((null===(r=b.mediaTypes)||void 0===r?void 0:r.banner)&&(C.banner=this.getFloorsForSizes(this.getBannerSizes(b),"banner",b)),(null===(s=b.mediaTypes)||void 0===s?void 0:s.native)&&(C.native=this.getFloorsForSizes(this.getNativeSizes(b),"native",b)),null===(a=b.mediaTypes)||void 0===a?void 0:a.video)){var E=b.mediaTypes.video.playerSize||[];C.video=0<E.length&&"number"==typeof E[0]?this.getFloorsForSizes([E],"video",b):this.getFloorsForSizes(E,"video",b)}Object.keys(C).length&&(y=_(_({},y),{floors:C}))}catch(t){R.Debug("Could not parse floors from Prebid: "+t)}this.slots.push(new tt(b.adUnitCode,b.params.zoneId,b.params.nativeCallback,b.transactionId,this.getSizes(b),b.params.publisherSubId,b.mediaTypes,kt.getVideoInfoFromBidRequest(b),y)),u=b.params.networkId||u,v=n.ceh,window.criteo_pubtag.context.ceh=v,b.params.integrationMode&&(p=K(b.params.integrationMode))}f||R.Warning("All native assets containing URL should be sent as placeholders with sendId(icon, image, clickUrl, privacyLink, privacyIcon)");var w,b,I=new z(!1);0<i.length&&(b=i[0]).userIdAsEids&&0<b.userIdAsEids.length&&(w=b.userIdAsEids);"function"==typeof window.criteo_pubtag.context.setPublisherExt&&"function"==typeof window.criteo_pubtag.context.setUserExt?(window.criteo_pubtag.context.setPublisherExt(n.publisherExt),window.criteo_pubtag.context.setUserExt(n.userExt)):(window.criteo_pubtag.context.publisherExt=n.publisherExt,window.criteo_pubtag.context.userExt=n.userExt);var S=xt.useZoneIdIntegration(this.slots,u);this.cache=new M(new mt(l),new xt(l,S,u),window.criteo_pubtag.context),this.requestBuilder=new X(this.cache.filterNoBidSlots(this.slots),window.criteo_pubtag.context,I,t,p,u,e,{ccpaIabConsent:c,gdprConsent:d},o,h,this.timeout,this.clientRequestId,w,n.start),this.url=this.requestBuilder.getUrl(),window.Criteo.prebid_adapters=window.Criteo.prebid_adapters||{},window.Criteo.prebid_adapters[this.auctionId]=this}var Ft=(Ut.prototype.send=function(t,e,i,n){var o=void 0!==this.data?"POST":"GET",r=this.getXMLHttpRequest(o,t,e,i,n);if(void 0!==r)r.send(this.data);else{var s=this.getXDomainRequest(o,t,e,i,n);void 0!==s&&s.send(this.data)}},Ut.prototype.getXMLHttpRequest=function(t,e,i,n,o){var r=new XMLHttpRequest;if("withCredentials"in r)return r.open(t,this.url,!0),r.timeout=o||Ut.LOCAL_PASSBACK_TIMEOUT,this.contentType?r.setRequestHeader("Content-type",this.contentType):"POST"===t&&r.setRequestHeader("Content-type","application/x-www-form-urlencoded"),r.withCredentials=this.withCredentials,r.onload=function(){4===r.readyState&&200===r.status?e(r.responseText):i(r.readyState,r.status)},r.onerror=function(){i(void 0,void 0)},n&&(r.ontimeout=n),r},Ut.prototype.getXDomainRequest=function(t,e,i,n,o){if("undefined"!=typeof XDomainRequest){var r=new XDomainRequest;return r.timeout=o||Ut.LOCAL_PASSBACK_TIMEOUT,r.open(t,this.url),r.onload=function(){void 0!==r.responseText?e(r.responseText):i(void 0,void 0)},r.onerror&&(r.onerror=function(){i(void 0,void 0)}),r.ontimeout&&n&&(r.ontimeout=n),r}},Ut.LOCAL_PASSBACK_TIMEOUT=3e4,Ut);function Ut(t,e,i,n){void 0===n&&(n=!0),this.url=t,this.data=e,this.contentType=i,this.withCredentials=n}function Nt(t){try{return JSON.parse(t)}catch(t){return}}var Lt=(qt.prototype.getCMPFrame=function(){for(var t,e=this.currentWindow,i=0;i<10;++i){try{e.frames.__uspapiLocator&&(t=e)}catch(t){}if(e===this.currentWindow.top)break;e=e.parent}return t},qt.prototype.hasCallerFunctionInWindow=function(){return"function"==typeof this.currentWindow.__uspapi},qt.prototype.readyToRetrieve=function(){return this.hasCallerFunctionInWindow()||void 0!==this.getCMPFrame()},qt.prototype.retrieveConsent=function(i){var n=this,o=!1,r=window.setTimeout(function(){o=!0,n.logger("Timeout: Unable to resolve CCPA consent after "+n.timeout+"ms"),i(void 0)},this.timeout);this.executeCommand("getUSPData",1,function(t,e){o||(clearTimeout(r),e?(n.logger("CCPA consent retrieved"),n.processResponseData(t,i)):(n.logger("Error retrieving CCPA consent data from CMP"),i(void 0)))})},qt.prototype.processResponseData=function(t,e){t?e(t):(this.logger("Unable to read CCPA consent data from CMP"),e(void 0))},qt.prototype.executeCommand=function(t,e,i){var r=this;if(!this.hasCallerFunctionInWindow()){this.logger("No CCPA CMP defined on current frame");var s=this.getCMPFrame();this.currentWindow.__uspapi=function(t,e,i){if(!s)return r.logger("CCPA CMP not found in any frame"),void i({msg:"CCPA CMP not found in any frame"},!1);var n=Math.random().toString(10),o={__uspapiCall:{command:t,parameter:e,callId:n}};r.uspapiCallbacks[n]=i,s.postMessage(o,"*")},this.currentWindow.addEventListener("message",function(t){var e="string"==typeof t.data?Nt(t.data):t.data;if(e&&e.__uspapiReturn&&e.__uspapiReturn.callId&&e.__uspapiReturn.returnValue){var i=e.__uspapiReturn;r.uspapiCallbacks&&r.uspapiCallbacks[i.callId]&&(r.uspapiCallbacks[i.callId](i.returnValue,i.success),delete r.uspapiCallbacks[i.callId])}},!1)}this.currentWindow.__uspapi(t,e,i)},qt.prototype.hasUserOptOut=function(t){return!(!t||!t.uspString||"1YNY"===t.uspString.toUpperCase()||"1YNN"===t.uspString.toUpperCase()||"1YN-"===t.uspString.toUpperCase()||"1-N-"===t.uspString.toUpperCase()||"1---"===t.uspString)},qt);function qt(t,e,i){void 0===i&&(i=function(t){}),this.uspapiCallbacks={},this.currentWindow=t,this.timeout=e.uspApiTimeout,this.logger=i}var Ht=(Wt.prototype.getReadyToRetrieveProvider=function(){return this.tcfv2ConsentProvider.hasCallerFunctionInFrame()?this.tcfv2ConsentProvider:this.tcfv1ConsentProvider.hasCallerFunctionInFrame()?this.tcfv1ConsentProvider:void 0!==this.tcfv2ConsentProvider.getCMPFrame()?this.tcfv2ConsentProvider:void 0!==this.tcfv1ConsentProvider.getCMPFrame()?this.tcfv1ConsentProvider:void 0},Wt.prototype.retrieveConsentForPassback=function(t){var e=this.getReadyToRetrieveProvider();void 0===e&&(this.logger("No compatible GDPR privacy provider found"),t(void 0)),e===this.tcfv1ConsentProvider?this.tcfv1ConsentProvider.retrieveConsentForPassback(t):e===this.tcfv2ConsentProvider&&this.tcfv2ConsentProvider.retrieveConsent(t)},Wt.prototype.retrieveConsent=function(t){var e=this.getReadyToRetrieveProvider();void 0===e&&(this.logger("No compatible GDPR privacy provider found"),t(void 0)),null==e||e.retrieveConsent(t)},Wt.prototype.readyToRetrieve=function(){return this.tcfv2ConsentProvider.readyToRetrieve()||this.tcfv1ConsentProvider.readyToRetrieve()},Wt);function Wt(t,e,i){void 0===i&&(i=function(t){}),this.tcfv1ConsentProvider=t,this.tcfv2ConsentProvider=e,this.logger=i}var Kt=(zt.prototype.getCMPFrame=function(){for(var t,e=this.currentWindow,i=0;i<10;++i){try{e.frames.__cmpLocator&&(t=e)}catch(t){}if(e===this.currentWindow.top)break;e=e.parent}return t},zt.prototype.hasCallerFunctionInFrame=function(){return"function"==typeof this.currentWindow.__cmp},zt.prototype.readyToRetrieve=function(){return this.hasCallerFunctionInFrame()||void 0!==this.getCMPFrame()},zt.prototype.pingWithTimeout=function(n,t,e,i){function o(t,e){r.logger(e),clearTimeout(t),i()}var r=this;return window.setTimeout(function(){var i=window.setTimeout(function(){o(n,"Timeout: Unable to get ping return after "+t+"ms")},t);r.executeCommand("ping",null,function(t,e){clearTimeout(i),e?(r.logger("GDPR CMP ping returned"),!0!==t.cmpLoaded&&o(n,"GDPR ping returned cmpLoaded which is not true"),r.logger("GDPR ping returned cmpLoaded which is true")):o(n,"Error sending ping to GDPR CMP")})},e)},zt.prototype.retrieveConsent=function(t){this.executeRetrieveConsent("getConsentData",null,t)},zt.prototype.retrieveConsentForPassback=function(t){this.executeRetrieveConsent("getVendorConsents",[91],t)},zt.prototype.executeRetrieveConsent=function(t,e,i){var n=this,o=!1,r=window.setTimeout(function(){o=!0,n.logger("Timeout: Unable to resolve GDPR consent after "+n.timeout+"ms"),i(void 0)},this.timeout),s=!1!==this.cmpAutoDetect?this.pingWithTimeout(r,this.pingTimeout,this.pingDelay,function(){o=!0,n.logger("Timeout: Unable to ping GDPR API after "+n.pingTimeout+"ms"),i(void 0)}):void 0;this.executeCommand(t,e,function(t,e){clearTimeout(s),o||(clearTimeout(r),e?(n.logger("GDPR consent retrieved"),n.processConsentData(t,i)):(n.logger("Error retrieving GDPR consent data from CMP"),i(void 0)))})},zt.prototype.processConsentData=function(t,e){if(t){var i={};void 0!==t.consentData&&(i.consentData=t.consentData),void 0!==t.gdprApplies&&(i.gdprApplies=!!t.gdprApplies),e(i)}else this.logger("Unable to read GDPR consent data from CMP"),e(void 0)},zt.prototype.executeCommand=function(t,e,i){var r=this;if(!this.hasCallerFunctionInFrame()){this.logger("No GDPR CMP defined on current frame");var s=this.getCMPFrame();this.currentWindow.__cmp=function(t,e,i){if(!s)return r.logger("GDPR CMP not found in any frame"),void i({msg:"GDPR CMP not found in any frame"},!1);var n=Math.random().toString(10),o={__cmpCall:{command:t,parameter:e,callId:n}};r.cmpCallbacks[n]=i,s.postMessage(o,"*")},this.currentWindow.addEventListener("message",function(t){var e="string"==typeof t.data?Nt(t.data):t.data;if(e&&e.__cmpReturn&&e.__cmpReturn.callId&&e.__cmpReturn.returnValue){var i=e.__cmpReturn;r.cmpCallbacks&&r.cmpCallbacks[i.callId]&&(r.cmpCallbacks[i.callId](i.returnValue,i.success),delete r.cmpCallbacks[i.callId])}},!1)}this.currentWindow.__cmp(t,e,i)},zt);function zt(t,e,i){void 0===i&&(i=function(t){}),this.cmpCallbacks={},this.currentWindow=t,this.timeout=e.tcfTimeout,this.pingTimeout=e.tcfPingTimeout,this.pingDelay=e.tcfPingDelay,this.cmpAutoDetect=e.cmpAutoDetect,this.logger=i}var Gt=(Vt.prototype.getCMPFrame=function(){for(var t,e=this.currentWindow,i=0;i<10;++i){try{e.frames.__tcfapiLocator&&(t=e)}catch(t){}if(e===this.currentWindow.top)break;e=e.parent}return t},Vt.prototype.hasCallerFunctionInFrame=function(){return"function"==typeof this.currentWindow.__tcfapi},Vt.prototype.readyToRetrieve=function(){return this.hasCallerFunctionInFrame()||void 0!==this.getCMPFrame()},Vt.prototype.pingWithTimeout=function(i,t,e,n){function o(t,e){r.logger(e),clearTimeout(t),n()}var r=this;return window.setTimeout(function(){var e=window.setTimeout(function(){o(i,"Timeout: Unable to get TCFv2 ping return after "+t+"ms")},t);r.executeCommand("ping",2,function(t){clearTimeout(e),r.logger("TCFv2 CMP ping returned in ms"),"error"===t.cmpStatus?o(i,"Error status on ping to TCFv2 CMP"):!0!==t.cmpLoaded?o(i,"TCFv2 ping returned cmpLoaded = false"):r.logger("TCFv2 ping returned cmpLoaded = true")})},e)},Vt.prototype.retrieveConsent=function(i){var n=this,o=!1,r=window.setTimeout(function(){o=!0,n.logger("Timeout: Unable to resolve TCFv2 consent after "+n.timeout+"ms"),i(void 0)},this.timeout),s=!1!==this.cmpAutoDetect?this.pingWithTimeout(r,this.pingTimeout,this.pingDelay,function(){o=!0,n.logger("Timeout: Unable to ping TCFv2 API after "+n.pingTimeout+"ms"),i(void 0)}):void 0;this.executeCommand("getTCData",2,function(t,e){clearTimeout(s),o||(clearTimeout(r),e?(n.logger("TCFv2 consent retrieved in ms"),n.processResponseData(t,i)):(n.logger("Error retrieving TCFv2 consent data from CMP"),i(void 0)))},[91])},Vt.prototype.processResponseData=function(t,e){var i;if(t){var n={};void 0!==t.tcString&&(n.consentData=t.tcString),void 0!==t.gdprApplies&&(n.gdprApplies=!!t.gdprApplies),n.version=t.tcfPolicyVersion?t.tcfPolicyVersion:2,n.purposes=null===(i=null==t?void 0:t.purpose)||void 0===i?void 0:i.consents,e(n)}else this.logger("Unable to read GDPR consent data from CMP"),e(void 0)},Vt.prototype.executeCommand=function(t,e,i,n){var s=this;if(!this.hasCallerFunctionInFrame()){this.logger("No TCFv2 CMP defined on current frame");var a=this.getCMPFrame();this.currentWindow.__tcfapi=function(t,e,i,n){if(!a)return s.logger("TCFv2 CMP not found in any frame"),void i({msg:"TCFv2 CMP not found in any frame"},!1);var o=Math.random().toString(10),r={__tcfapiCall:{command:t,version:e,parameter:n,callId:o}};s.cmpCallbacks[o]=i,a.postMessage(r,"*")},this.currentWindow.addEventListener("message",function(t){var e="string"==typeof t.data?Nt(t.data):t.data;if(e&&e.__tcfapiReturn&&e.__tcfapiReturn.callId&&e.__tcfapiReturn.returnValue){var i=e.__tcfapiReturn;s.cmpCallbacks&&s.cmpCallbacks[i.callId]&&"function"==typeof s.cmpCallbacks[i.callId]&&(s.cmpCallbacks[i.callId](i.returnValue,i.success),delete s.cmpCallbacks[i.callId])}},!1)}this.currentWindow.__tcfapi(t,e,i,n)},Vt);function Vt(t,e,i){void 0===i&&(i=function(t){}),this.cmpCallbacks={},this.currentWindow=t,this.timeout=e.tcfTimeout,this.pingTimeout=e.tcfPingTimeout,this.pingDelay=e.tcfPingDelay,this.cmpAutoDetect=e.cmpAutoDetect,this.logger=i}var jt=(Yt.prototype.initializeServices=function(){var n=this;this.initializing=!0,this.retrievePrivacyConsent(function(t,e){var i={localStorageHelper:new ft(n.topFrame,e),gdprConsent:e,ccpaConsentProvider:n.ccpaConsentProvider,ccpaConsent:t};n.services=i,n.initialized=!0,n.initializing=!1,n.postInitiliazeServicesCallbacks.forEach(function(t){t(i)})})},Yt.prototype.getServicesAsync=function(t){this.initialized?t(this.services):(this.postInitiliazeServicesCallbacks.push(t),this.initializing||this.initializeServices())},Yt.prototype.retrievePrivacyConsent=function(e){var t=this.tcfCompatibleConsentProvider.readyToRetrieve(),i=this.ccpaConsentProvider.readyToRetrieve();t||i||e(void 0,void 0);var n,o,r=[];t&&r.push(Ht),i&&r.push(Lt),t&&this.tcfCompatibleConsentProvider.retrieveConsent(function(t){r.splice(r.indexOf("TCF"),1),0===r.length?e(o,t):n=t}),i&&this.ccpaConsentProvider.retrieveConsent(function(t){r.splice(r.indexOf("CCPA"),1),0===r.length?e(t,n):o=t})},Yt);function Yt(t,e,i,n){this.initializing=!1,this.initialized=!1,this.postInitiliazeServicesCallbacks=[],this.topFrame=t||window;var o,r=(o=n,{uspApiTimeout:parseInt("50",10),tcfTimeout:parseInt("10000",10),tcfPingTimeout:Math.min(parseInt("10000",10),parseInt("50",10)),tcfPingDelay:Math.min(parseInt("10000",10),parseInt("1000",10)),cmpAutoDetect:null==o?void 0:o.cmpAutoDetect});this.ccpaConsentProvider=e||new Lt(window,r,R.Warning);var s=new Kt(window,r,R.Warning),a=new Gt(window,r,R.Warning);this.tcfCompatibleConsentProvider=i||new Ht(s,a,R.Warning),this.initializeServices()}var Jt=(Xt.prototype.retrievePixels=function(t,e){var i=this;new Ft(this.getUserSyncUrl(t,e)).send(function(t){if(t){var e=Xt.parseUserSyncResponse(t);e?i.onPixelsRetrieved(e):i.errorReporter.log("Error","Unable to parse response from user sync")}},function(t,e){R.Warning("User Sync Pixel endpoint error; readyState "+t+"; requestStatus "+e)},function(){R.Warning("User Sync Pixel endpoint timeout")},this.pixelSyncTimeout)},Xt.prototype.getUserSyncUrl=function(t,e){var i=[];return(null==t?void 0:t.consentData)&&i.push("gdpr="+t.consentData),(null==t?void 0:t.gdprApplies)&&i.push("gdprapplies="+t.gdprApplies),(null==e?void 0:e.uspString)&&i.push("ccpa="+e.uspString),this.debug&&i.push("debug=1"),this.pixelSyncEndpoint+(i.length?"?"+i.join("&"):"")},Xt.parseUserSyncResponse=function(t){var e=N(t);return e?("pixels"in e?Array.isArray(e.pixels)?e.pixels=e.pixels.filter(function(e){try{return new URL(e),!0}catch(t){return R.Warning("Failed to parse User Sync Pixel URL: "+e),!1}}):(R.Warning("pixels field in user sync response is not an array: "+e.pixels),e.pixels=[]):e.pixels=[],e):void R.Warning("Failed to parse user sync pixel JSON payload")},Xt);function Xt(t,e,i){void 0===i&&(i=!1),this.pixelSyncEndpoint="https://tpd.criteo.com",this.pixelSyncTimeout=2e3,this.errorReporter=e,this.onPixelsRetrieved=t,this.debug=i}var Zt=(Qt.execUserSync=function(t,e,i,n){void 0===n&&(n=!1),new Jt(Qt.appendUserSyncPixels,t,n).retrievePixels(e,i)},Qt.getOrCreateTagContainer=function(){var t=document.getElementById(Qt.tagElementName);if(t)return t;var e=document.createElement("div");return e.setAttribute("id",Qt.tagElementName),e.style.display="none",document.body.appendChild(e),e},Qt.appendUserSyncPixels=function(t){if(t.pixels.length)for(var e=Qt.getOrCreateTagContainer(),i=0,n=t.pixels;i<n.length;i++){var o=n[i],r=new Image;r.src=o,e.appendChild(r)}},Qt.tagElementName="criteoUserSyncTagsContainer",Qt);function Qt(){}var $t,te=(t(ee,$t=p),ee.prototype.getMetricBuilder=function(){return this.metricBuilder},ee.prototype.eval=function(t){this.evalWithTimeout(t,void 0)},ee.prototype.evalWithTimeout=function(e,i){var n=this;(this.serviceProvider||new jt).getServicesAsync(function(t){n.metricsManager||(n.metricsManager=new V(t.localStorageHelper,n.profileId,n.adapterVersion)),n.metricBuilder||(n.metricBuilder=new F(n.metricsManager)),n.innerEval(e,n.metricBuilder,t.gdprConsent,t.ccpaConsent,i)})},ee.prototype.innerEval=function(n,o,r,s,t){var a=this,d=$(),e=ee.getCriteoAdapterBidRequest(),i=ee.getRequestAuctionStart(e),c=t||dt(e&&e.timeout),l=new ot(o,i,c),u=new X(this.slots,n.context,this.urlBuilder,this.profileId,this.integrationMode,this.networkId,this.adapterVersion,{ccpaIabConsent:s,gdprConsent:r},void 0,this.viewportComputer,c,d,void 0,Math.round(new Date/1e3));if(!u.isValid()||"undefined"==typeof JSON)return R.Debug("Request ignored because it doesnt contain any slot"),void this.callbackError(void 0,void 0);var p=u.getRequest(),h=JSON.stringify(p),v=u.getUrl(),f=new Ft(v,h,"application/x-www-form-urlencoded");l.sendRequest(v),f.send(function(t){try{l.requestReceived();var e=N(t)||{},i=Q(e);void 0!==a.callbackSuccess&&a.callbackSuccess(JSON.stringify(e),i),l.finish(i.slots),!0===e.user_sync&&Zt.execUserSync(n.context.remoteLogging,r,s),o.getMetricsManager().sendEvents(o,d,!0)}catch(t){a.reportAsyncRequestException(n,"onSuccess",t)}n.context.remoteLogging.sendErrorReport(a.urlBuilder,d),a.metricBuilder=void 0},function(t,e){try{l.requestReceived(),void 0!==a.callbackError&&a.callbackError(t,e),l.finish(),o.getMetricsManager().sendEvents(o,d,!0)}catch(t){a.reportAsyncRequestException(n,"onError",t)}n.context.remoteLogging.sendErrorReport(a.urlBuilder,d),a.metricBuilder=void 0},function(){try{l.requestReceived(!0),void 0!==a.callbackTimeout&&a.callbackTimeout(),l.finish(),o.getMetricsManager().sendEvents(o,d,!0)}catch(t){a.reportAsyncRequestException(n,"onTimeout",t)}n.context.remoteLogging.sendErrorReport(a.urlBuilder,d),a.metricBuilder=void 0},this.timeout)},ee.prototype.reportAsyncRequestException=function(t,e,i){var n=i.stack?i.stack:i.toString();t.context.remoteLogging.log("Exception","Exception caught in AsyncRequest "+e+" callback:\n"+n),R.Error("Error "+e+":\n\t"+n)},ee.getCriteoAdapterBidRequest=function(){try{return window.pbjs._bidsRequested.find(function(t){return"criteo"===t.bidderCode})}catch(t){return}},ee.getRequestAuctionStart=function(t){return t&&t.auctionStart},ee.NAME="directbidding",ee);function ee(t,e,i,n,o,r,s,a,d,c,l,u,p){var h=$t.call(this,ee.NAME)||this;return h.profileId=t,h.urlBuilder=e,h.slots=i,h.callbackSuccess=n,h.callbackError=o,h.callbackTimeout=r,h.serviceProvider=s,h.timeout=d,h.networkId=c,h.integrationMode=l,h.adapterVersion=u,h.viewportComputer=p,h.metricsManager=a,h.metricsManager&&(h.metricBuilder=new F(h.metricsManager)),h}var ie,ne=(t(oe,ie=p),oe.prototype.eval=function(t){var e=this;if(this.cache.silentModeEnabled())return R.Debug("Request ignored because the global silent mode is enabled"),this.metricsManager.incSilentModeRequestCount(),void this.callbackSuccess("",void 0);setTimeout(function(){return e.onTimeout()},this.timeout||3e3),this.directBiddingEvent.evalWithTimeout(t,this.timeout)},oe.prototype.onSuccess=function(t,e){if(this.hasResponded=!0,void 0!==e){var i=N(t);this.cache.handleResponse(this.slots,i,e,this.hasTimeouted)}this.hasTimeouted||this.callbackSuccess(t,e),this.cache.clearExpiredItems()},oe.prototype.onError=function(t,e){this.hasResponded=!0,this.hasTimeouted||this.callbackError(t,e),this.cache.clearExpiredItems()},oe.prototype.onHttpTimeout=function(){this.hasResponded=!0,this.hasTimeouted||this.callbackTimeout(),this.cache.clearExpiredItems()},oe.prototype.onTimeout=function(){var t;if(!this.hasResponded){this.hasTimeouted=!0;var e=this.cache.getCachedBids(this.slots),i=Object.keys(e),n=i.map(function(t){return e[t]});0===Object.keys(e).length?this.callbackTimeout():(R.Debug("Cached bids returned because of timeout: ['"+n.map(function(t){return t.impid}).join("', '")+"']"),null===(t=this.getMetricBuilder())||void 0===t||t.withSlotIdsMatchedByCache(i),this.callbackSuccess(JSON.stringify({slots:n}),void 0))}},oe.prototype.getMetricBuilder=function(){return this.directBiddingEvent.getMetricBuilder()},oe.prototype.getBidCache=function(){return this.cache},oe.NAME="directbidding",oe);function oe(t,e,i,n,o,r,s,a,d,c,l,u,p,h){var v=ie.call(this,oe.NAME)||this,f=Math.max(10*(c||3e3),3e3);return v.cache=a,v.directBiddingEvent=new te(t,e,v.cache.filterNoBidSlots(i),function(t,e){return v.onSuccess(t,e)},function(t,e){return v.onError(t,e)},function(){return v.onHttpTimeout()},d,s,f,l,u,p,h),v.slots=i,v.callbackSuccess=n,v.callbackError=o,v.callbackTimeout=r,v.timeout=c,v.hasTimeouted=!1,v.hasResponded=!1,v.metricsManager=s,v}var re={prebid:"criteo_fast_bid",standalone:"criteo_fast_bid_standalone",index:"criteo_fast_bid_index"};var se="undefined"!=typeof globalThis?globalThis:"undefined"!=typeof window?window:"undefined"!=typeof global?global:"undefined"!=typeof self?self:{};var ae,de=(function(t,e){var i;i=function(){function d(t){return"function"==typeof t}var i=Array.isArray?Array.isArray:function(t){return"[object Array]"===Object.prototype.toString.call(t)},n=0,e=void 0,o=void 0,s=function(t,e){p[n]=t,p[n+1]=e,2===(n+=2)&&(o?o(h):y())};var t="undefined"!=typeof window?window:void 0,r=t||{},a=r.MutationObserver||r.WebKitMutationObserver,c="undefined"==typeof self&&"undefined"!=typeof process&&"[object process]"==={}.toString.call(process),l="undefined"!=typeof Uint8ClampedArray&&"undefined"!=typeof importScripts&&"undefined"!=typeof MessageChannel;function u(){var t=setTimeout;return function(){return t(h,1)}}var p=new Array(1e3);function h(){for(var t=0;t<n;t+=2){(0,p[t])(p[t+1]),p[t]=void 0,p[t+1]=void 0}n=0}var v,f,g,m,y=void 0;function C(t,e){var i=this,n=new this.constructor(b);void 0===n[w]&&F(n);var o=i._state;if(o){var r=arguments[o-1];s(function(){return B(o,n,r,i._result)})}else D(i,n,t,e);return n}function E(t){if(t&&"object"==typeof t&&t.constructor===this)return t;var e=new this(b);return R(e,t),e}y=c?function(){return process.nextTick(h)}:a?(f=0,g=new a(h),m=document.createTextNode(""),g.observe(m,{characterData:!0}),function(){m.data=f=++f%2}):l?((v=new MessageChannel).port1.onmessage=h,function(){return v.port2.postMessage(0)}):(void 0===t?function(){try{var t=Function("return this")().require("vertx");return void 0!==(e=t.runOnLoop||t.runOnContext)?function(){e(h)}:u()}catch(t){return u()}}:u)();var w=Math.random().toString(36).substring(2);function b(){}var I=void 0,S=1,_=2;function T(t,n,o){s(function(e){var i=!1,t=function(t,e,i,n){try{t.call(e,i,n)}catch(t){return t}}(o,n,function(t){i||(i=!0,(n!==t?R:x)(e,t))},function(t){i||(i=!0,P(e,t))},e._label);!i&&t&&(i=!0,P(e,t))},t)}function A(t,e,i){var n,o;e.constructor===t.constructor&&i===C&&e.constructor.resolve===E?(n=t,(o=e)._state===S?x(n,o._result):o._state===_?P(n,o._result):D(o,void 0,function(t){return R(n,t)},function(t){return P(n,t)})):void 0===i?x(t,e):d(i)?T(t,e,i):x(t,e)}function R(e,t){if(e===t)P(e,new TypeError("You cannot resolve a promise with itself"));else if(o=typeof(n=t),null===n||"object"!=o&&"function"!=o)x(e,t);else{var i=void 0;try{i=t.then}catch(t){return void P(e,t)}A(e,t,i)}var n,o}function M(t){t._onerror&&t._onerror(t._result),O(t)}function x(t,e){t._state===I&&(t._result=e,t._state=S,0!==t._subscribers.length&&s(O,t))}function P(t,e){t._state===I&&(t._state=_,t._result=e,s(M,t))}function D(t,e,i,n){var o=t._subscribers,r=o.length;t._onerror=null,o[r]=e,o[r+S]=i,o[r+_]=n,0===r&&t._state&&s(O,t)}function O(t){var e=t._subscribers,i=t._state;if(0!==e.length){for(var n=void 0,o=void 0,r=t._result,s=0;s<e.length;s+=3)n=e[s],o=e[s+i],n?B(i,n,o,r):o(r);t._subscribers.length=0}}function B(t,e,i,n){var o=d(i),r=void 0,s=void 0,a=!0;if(o){try{r=i(n)}catch(t){a=!1,s=t}if(e===r)return void P(e,new TypeError("A promises callback cannot return that same promise."))}else r=n;e._state!==I||(o&&a?R(e,r):!1===a?P(e,s):t===S?x(e,r):t===_&&P(e,r))}var k=0;function F(t){t[w]=k++,t._state=void 0,t._result=void 0,t._subscribers=[]}var U=(N.prototype._enumerate=function(t){for(var e=0;this._state===I&&e<t.length;e++)this._eachEntry(t[e],e)},N.prototype._eachEntry=function(e,t){var i=this._instanceConstructor,n=i.resolve;if(n===E){var o=void 0,r=void 0,s=!1;try{o=e.then}catch(t){s=!0,r=t}if(o===C&&e._state!==I)this._settledAt(e._state,t,e._result);else if("function"!=typeof o)this._remaining--,this._result[t]=e;else if(i===L){var a=new i(b);s?P(a,r):A(a,e,o),this._willSettleAt(a,t)}else this._willSettleAt(new i(function(t){return t(e)}),t)}else this._willSettleAt(n(e),t)},N.prototype._settledAt=function(t,e,i){var n=this.promise;n._state===I&&(this._remaining--,t===_?P(n,i):this._result[e]=i),0===this._remaining&&x(n,this._result)},N.prototype._willSettleAt=function(t,e){var i=this;D(t,void 0,function(t){return i._settledAt(S,e,t)},function(t){return i._settledAt(_,e,t)})},N);function N(t,e){this._instanceConstructor=t,this.promise=new t(b),this.promise[w]||F(this.promise),i(e)?(this.length=e.length,this._remaining=e.length,this._result=new Array(this.length),0===this.length?x(this.promise,this._result):(this.length=this.length||0,this._enumerate(e),0===this._remaining&&x(this.promise,this._result))):P(this.promise,new Error("Array Methods must be provided an Array"))}var L=(q.prototype.catch=function(t){return this.then(null,t)},q.prototype.finally=function(e){var i=this.constructor;return d(e)?this.then(function(t){return i.resolve(e()).then(function(){return t})},function(t){return i.resolve(e()).then(function(){throw t})}):this.then(e,e)},q);function q(t){this[w]=k++,this._result=this._state=void 0,this._subscribers=[],b!==t&&("function"!=typeof t&&function(){throw new TypeError("You must pass a resolver function as the first argument to the promise constructor")}(),this instanceof q?function(e,t){try{t(function(t){R(e,t)},function(t){P(e,t)})}catch(t){P(e,t)}}(this,t):function(){throw new TypeError("Failed to construct 'Promise': Please use the 'new' operator, this object constructor cannot be called as a function.")}())}return L.prototype.then=C,L.all=function(t){return new U(this,t).promise},L.race=function(o){var r=this;return i(o)?new r(function(t,e){for(var i=o.length,n=0;n<i;n++)r.resolve(o[n]).then(t,e)}):new r(function(t,e){return e(new TypeError("You must pass an array to race."))})},L.resolve=E,L.reject=function(t){var e=new this(b);return P(e,t),e},L._setScheduler=function(t){o=t},L._setAsap=function(t){s=t},L._asap=s,L.polyfill=function(){var t=void 0;if(void 0!==se)t=se;else if("undefined"!=typeof self)t=self;else try{t=Function("return this")()}catch(t){throw new Error("polyfill failed because global object is unavailable in this environment")}var e=t.Promise;if(e){var i=null;try{i=Object.prototype.toString.call(e.resolve())}catch(t){}if("[object Promise]"===i&&!e.cast)return}t.Promise=L},L.Promise=L},t.exports=i()}(ae={exports:{}},ae.exports),ae.exports).polyfill,ce=(le.LoadPolyfills=function(){le.DefineIsArray(),le.DefineIndexOf(),le.DefineFilter(),le.DefinePromise()},le.DefinePromise=function(){window.Promise||de()},le.DefineIsArray=function(){Array.isArray||(Array.isArray=function(t){return"[object Array]"===Object.prototype.toString.call(t)})},le.DefineIndexOf=function(){Array.prototype.indexOf||(Array.prototype.indexOf=function(t,e){if(void 0===e&&(e=0),void 0===this)throw new TypeError("'this' is null or not defined");var i=this.length;if(0===i)return-1;if(i<=e)return-1;for(var n=Math.max(0<=e?e:i-Math.abs(e),0);n<i;){if(n in this&&this[n]===t)return n;n++}return-1})},le.DefineFilter=function(){Array.prototype.filter||(Array.prototype.filter=function(t){if(void 0===this||void 0===this)throw new TypeError;var e=this.length;if("function"!=typeof t)throw new TypeError;for(var i=[],n=2<=arguments.length?arguments[1]:void 0,o=0;o<e;o++)if(o in this){var r=this[o];t.call(n,r,o,this)&&i.push(r)}return i})},le);function le(){}var ue,pe,he=(ve.SetCookie=function(t,e,i,n,o){void 0===o&&(o=!1);var r=n||document,s=r.location.hostname,a=new Date;a.setTime(a.getTime()+60*i*60*1e3);var d="expires="+a.toUTCString();if(!o)return ve.setCookieString(t,e,d,void 0,r),s;for(var c=s.split("."),l=0;l<c.length;++l){var u=c.slice(c.length-l-1,c.length).join(".");ve.setCookieString(t,e,d,u,r);var p=ve.GetCookie(t,n);if(p&&p===e)return u}return s},ve.DeleteCookie=function(t,e,i){void 0===i&&(i=!1),ve.SetCookie(t,"",0,e,i)},ve.GetCookie=function(t,e){for(var i=0,n=(e||document).cookie.split(";");i<n.length;i++){var o=n[i],r=o.substr(0,o.indexOf("=")).replace(/^\s+|\s+$/g,""),s=o.substr(o.indexOf("=")+1);if(r===t)return decodeURIComponent(s)}},ve.setCookieString=function(t,e,i,n,o){var r=t+"="+encodeURIComponent(e)+";"+i+";";n&&""!==n&&(r+="domain=."+n+";"),o.cookie=r+"path=/"},ve);function ve(){}function fe(e,i){try{return decodeURIComponent(e)}catch(t){return void 0!==i?i:e}}(pe=ue=ue||{})[pe.None=0]="None",pe[pe.Cookie=1]="Cookie",pe[pe.LocalStorage=2]="LocalStorage";var ge=(me.prototype.synchronizeCriteoUid=function(t,e){var i=this;if(t&&(this.tcfV2ConsentString=t),this.topWin.addEventListener)if("complete"===this.topDoc.readyState)this.appendGumIframeIfDoesNotExist(e);else{var n=function(){i.topDoc.removeEventListener("DOMContentLoaded",n),i.topWin.removeEventListener("load",n),i.appendGumIframeIfDoesNotExist(e)};this.topWin.addEventListener("load",n,!1),this.topDoc.addEventListener("DOMContentLoaded",n,!1)}},me.prototype.appendGumIframeIfDoesNotExist=function(r){var s=this,t=this.createGumIframe();this.topDoc.getElementById(me.SYNCFRAME_ID)||(this.topWin.addEventListener("message",function(t){var e=t.data;if(e&&e.isCriteoMessage)if(t.stopImmediatePropagation(),e.optout)s.setClientSideOptOut(),s.deleteClientSideUid(),s.deleteClientSideSecureId(),s.deleteBundle();else{if(e.uid&&s.setClientSideUid(e.uid),e.callbacks)for(var i=0,n="string"==typeof e.callbacks?[e.callbacks]:e.callbacks;i<n.length;i++){var o=n[i];(new Image).src=o}else e.bundle&&(s.setBundle(e.bundle),e.enableEsp&&r&&r(e.bundle));e.removeSid?s.deleteClientSideSecureId():e.sid&&s.setClientSideSecureId(e.sid)}},!0),this.topDoc.body.appendChild(t))},me.prototype.getClientSideUid=function(){return this.getFromAllStorages(me.GUID_COOKIE_NAME)},me.prototype.setClientSideUid=function(t){this.writeOnAllStorages(me.GUID_COOKIE_NAME,t,me.GUID_RETENTION_TIME_HOUR)},me.prototype.deleteClientSideUid=function(){this.deleteFromAllStorage(me.GUID_COOKIE_NAME)},me.prototype.getBundle=function(){return this.getFromAllStorages(me.BUNDLE_COOKIE_NAME)},me.prototype.setBundle=function(t){this.writeOnAllStorages(me.BUNDLE_COOKIE_NAME,t,me.GUID_RETENTION_TIME_HOUR)},me.prototype.deleteBundle=function(){this.deleteFromAllStorage(me.BUNDLE_COOKIE_NAME)},me.prototype.getClientSideOptOut=function(){var t=this.getFromAllStorages(me.OPTOUT_COOKIE_NAME);return{value:"1"===t.value,origin:t.origin}},me.prototype.setClientSideOptOut=function(){this.writeOnAllStorages(me.OPTOUT_COOKIE_NAME,"1",me.OPTOUT_RETENTION_TIME_HOUR)},me.prototype.getClientSideSecureId=function(){return this.getFromAllStorages(me.SECURE_ID_COOKIE_NAME)},me.prototype.setClientSideSecureId=function(t){this.writeOnAllStorages(me.SECURE_ID_COOKIE_NAME,t,me.GUID_RETENTION_TIME_HOUR)},me.prototype.deleteClientSideSecureId=function(){this.deleteFromAllStorage(me.SECURE_ID_COOKIE_NAME)},me.prototype.getClientSideLocalWebId=function(){return this.getFromAllStorages(me.LOCAL_WEB_ID_COOKIE_NAME)},me.prototype.getIfa=function(){return this.getFromAllStorages(me.IFA_COOKIE_NAME)},me.prototype.checkCookiesAreWriteable=function(){var t="cto_writeable";he.SetCookie(t,"1",1,this.topDoc,!0);var e="1"===he.GetCookie(t,this.topDoc);return he.DeleteCookie(t,this.topDoc,!0),e},me.prototype.createGumIframe=function(){var t=this.topDoc.createElement("iframe");return t.src=this.buildSyncframeSrc(),t.id=me.SYNCFRAME_ID,t.style.display="none",t},me.prototype.writeOnAllStorages=function(t,e,i){this.localStorageHelper.setItem(t,e),he.SetCookie(t,e,i,this.topDoc,!0)},me.prototype.getFromAllStorages=function(t){var e=he.GetCookie(t,this.topDoc),i=this.localStorageHelper.getItem(t)||void 0;return{value:e||i,origin:(e&&ue.Cookie)|(i&&ue.LocalStorage)}},me.prototype.deleteFromAllStorage=function(t){he.DeleteCookie(t,this.topDoc,!0),this.localStorageHelper.removeItem(t)},me.prototype.getTld=function(){var t=he.SetCookie(me.TLD_TEST_COOKIE_NAME,"test",1,this.topDoc,!0);return he.DeleteCookie(me.TLD_TEST_COOKIE_NAME,this.topDoc,!0),t},me.prototype.buildSyncframeSrc=function(){var t,e,i=this.getClientSideUid(),n=this.getClientSideOptOut(),o=this.getClientSideSecureId(),r=this.getClientSideLocalWebId(),s=this.getBundle(),a=this.getIfa(),d=this.getTld(),c=encodeURIComponent((t=this.topUrl,(e=document.createElement("a")).href=t,{protocol:e.protocol,host:e.host,hostname:e.hostname,pathname:"/"===e.pathname[0]?e.pathname.slice(1):e.pathname,search:e.search,href:e.href}).hostname),l=this.canWriteCookies,u=this.localStorageHelper.localStorageEnabled,p="https://gum.criteo.com/syncframe?topUrl="+c+(this.isDebug?"&debug=1":"")+(this.tcfV2ConsentString?"&gdpr_consent="+this.tcfV2ConsentString:"");return p+="#"+JSON.stringify({optout:n,uid:i,sid:o,origin:"publishertag",version:101,lwid:r,tld:d,bundle:s,topUrl:c,cw:l,ifa:a,lsw:u})},me.GUID_COOKIE_NAME="cto_idcpy",me.GUID_RETENTION_TIME_HOUR=9360,me.SECURE_ID_COOKIE_NAME="cto_sid",me.LOCAL_WEB_ID_COOKIE_NAME="cto_lwid",me.BUNDLE_COOKIE_NAME="cto_bundle",me.OPTOUT_COOKIE_NAME="cto_optout",me.IFA_COOKIE_NAME="id_controller_ifa",me.OPTOUT_RETENTION_TIME_HOUR=43200,me.TLD_TEST_COOKIE_NAME="cto_pub_test_tld",me.SYNCFRAME_ID="criteo-syncframe",me);function me(t,e,i,n){this.isDebug=i,this.topWin=e,this.topDoc=e.document,this.localStorageHelper=t,this.canWriteCookies=this.checkCookiesAreWriteable(),this.topUrl=n}var ye=function(t,e){this.errorType=t,this.messages=e},Ce=function(t,e,i){this.environment=t,this.errors=e,this.requestId=i},Ee=(we.prototype.withMessage=function(t,e){return t in this.messages||(this.messages[t]=new Array),this.messages[t].push(e),this},we.prototype.withRequestId=function(t){return this.requestId=t,this},we.prototype.build=function(){var t=Array();for(var e in this.messages)null!=e&&t.push(new ye(e,this.messages[e]));return new Ce(this.environment,t,this.requestId)},we);function we(t){this.messages={},this.environment=t}var be,Ie,Se=(_e.prototype.reportPending=function(){return this.shouldSend},_e.prototype.sendErrorReport=function(t,e){if(this.shouldSend){void 0!==e&&this.builder.withRequestId(e);var i=this.builder.build(),n=t.buildErrorUrl();n+=this.debug?"?debug=1":"";var o=JSON.stringify(i);navigator.sendBeacon&&navigator.sendBeacon(n,o),this.shouldSend=!1,this.builder=new Ee(_e.environment)}},_e.prototype.log=function(t,e){this.shouldSend=!0,this.builder.withMessage(t,e)},_e.environment="PublisherTag Version "+O,_e);function _e(t){void 0===t&&(t=!1),this.builder=new Ee(_e.environment),this.shouldSend=!1,this.debug=t}function Te(t){window.googletag=window.googletag||{},window.googletag.cmd=window.googletag.cmd||[],window.googletag.cmd.push(t)}(Ie=be=be||{})[Ie.InFriendlyIframe=1]="InFriendlyIframe",Ie[Ie.InUnfriendlyIframe=2]="InUnfriendlyIframe",Ie[Ie.DirectIntegration=3]="DirectIntegration";var Ae=(Re.prototype.getUserContextualData=function(){var t,e,i,n,o,r,s,a,d,c,l,u,p,h;return{data:{contentLanguage:this.getContentLanguage(),navigatorLanguage:null===(e=null===(t=this.window)||void 0===t?void 0:t.navigator)||void 0===e?void 0:e.language,orientation:this.getOrientation(),windowInnerWidth:null===(i=this.window)||void 0===i?void 0:i.innerWidth,windowInnerHeight:null===(n=this.window)||void 0===n?void 0:n.innerHeight,pageWidth:null===(s=null===(r=null===(o=this.window)||void 0===o?void 0:o.document)||void 0===r?void 0:r.documentElement)||void 0===s?void 0:s.scrollWidth,pageHeight:null===(c=null===(d=null===(a=this.window)||void 0===a?void 0:a.document)||void 0===d?void 0:d.documentElement)||void 0===c?void 0:c.scrollHeight,sessionDuration:it.TimeSincePageLoad()},device:{w:null===(u=null===(l=this.window)||void 0===l?void 0:l.screen)||void 0===u?void 0:u.width,h:null===(h=null===(p=this.window)||void 0===p?void 0:p.screen)||void 0===h?void 0:h.height}}},Re.prototype.getOrientation=function(){var t,e,i,n,o,r;return((null===(e=null===(t=this.window)||void 0===t?void 0:t.screen)||void 0===e?void 0:e.orientation)||{}).type||(null===(n=null===(i=this.window)||void 0===i?void 0:i.screen)||void 0===n?void 0:n.mozOrientation)||(null===(r=null===(o=this.window)||void 0===o?void 0:o.screen)||void 0===r?void 0:r.msOrientation)},Re.prototype.getContentLanguage=function(){var t,e,i,n,o,r=null===(i=null===(e=null===(t=this.window)||void 0===t?void 0:t.document)||void 0===e?void 0:e.documentElement)||void 0===i?void 0:i.lang;if(!r&&"function"==typeof(null===(o=null===(n=this.window)||void 0===n?void 0:n.document)||void 0===o?void 0:o.querySelector)){var s=this.window.document.querySelector('meta[http-equiv="Content-Language"]');r=null==s?void 0:s.content}return r},Re);function Re(t){this.window=t}var Me=(xe.prototype.getContextFlags=function(){var t="";return t+=this.debugMode?"&debug=1":"",t+=this.noLog?"&nolog=1":""},xe.prototype.getDisplayContext=function(t){return ut.inIframe()?t.err?be.InUnfriendlyIframe:be.InFriendlyIframe:be.DirectIntegration},xe.prototype.getQueryStringParams=function(t){var e={},i=t.split("?");if(1<i.length)for(var n=0,o=i[1].split("&");n<o.length;n++){var r=o[n].split("=");e[fe(r[0])]=fe(r[1])}return e},xe.prototype.synchronizeCriteoUid=function(t,i){var e,n=(null===(e=this.cookieSynchronizerFactory)||void 0===e?void 0:e.call(this))||new ge(t,this.highestAccessibleWindowStruct.topFrame,this.debugMode,this.highestAccessibleUrl);this.ctoIdOnPublisherDomain=n.getClientSideUid().value,this.isOptOut=n.getClientSideOptOut().value,this.secureId=n.getClientSideSecureId().value,this.bundle=n.getBundle().value;var o,r=new Promise(function(e,t){n.synchronizeCriteoUid(i,function(t){R.Debug("Resolving GPT ESP Promise"),e(t)})});window.googletag&&(o=r,Te(function(){var t;window.googletag.encryptedSignalSource=null!==(t=window.googletag.encryptedSignalSource)&&void 0!==t?t:{},R.Debug("Promise set for GPT ESP"),window.googletag.encryptedSignalSource.criteo=function(){return R.Debug("Returning Promise to GPT"),o}}))},xe.prototype.getIdfs=function(){return["",this.secureId].join(":")},xe.prototype.setIdfs=function(t){var e=t.split(":");e[1]&&(this.secureId=e[1])},xe.prototype.computeShouldIgnoreSilentMode=function(){return Math.floor(100*Math.random())<5},xe.prototype.setSilentModeIgnored=function(){this.silentModeIgnored=!0},xe.prototype.setPublisherExt=function(t){this.publisherExt=t},xe.prototype.getPublisherExt=function(){return this.publisherExt},xe.prototype.setUserExt=function(t){this.userExt=t},xe.prototype.getUserExtWithContextualData=function(){this.userExt=this.userExt||{};var t=this.userContextualDataManager.getUserContextualData();return this.userExt.data=_(_({},this.userExt.data),null==t?void 0:t.data),this.userExt.device=_(_({},this.userExt.device),null==t?void 0:t.device),this.userExt},xe);function xe(t,e,i,n,o,r){var s=this;this.cloneByImpressionId={},this.charset=t.charset||t.characterSet||"",this.highestAccessibleWindowStruct=ut.getHighestAccessibleWindow(e),this.displayContext=this.getDisplayContext(this.highestAccessibleWindowStruct),this.highestAccessibleUrl=ut.getHighestAccessibleUrl(this.highestAccessibleWindowStruct),this.cookieSynchronizerFactory=i;var a,d=this.getQueryStringParams(this.highestAccessibleUrl);this.debugMode="1"===d.pbt_debug||!1,this.noLog="1"===d.pbt_nolog||!1,this.shouldIgnoreSilentMode=this.computeShouldIgnoreSilentMode(),this.silentModeIgnored=!1,this.remoteLogging=new Se(this.debugMode),this.debugMode&&(a=c.Debug,R.LOGLEVEL=a),this.location=e.location,this.dising=!1,this.ct0=void 0,this.wpdt0=void 0,this.isAdBlocked=void 0,this.rtaVarNames=[],this.serviceProvider=n||new jt(this.highestAccessibleWindowStruct.topFrame,void 0,void 0,o),this.serviceProvider.getServicesAsync(function(t){var e,i;(null===(e=t.ccpaConsentProvider)||void 0===e?void 0:e.hasUserOptOut(t.ccpaConsent))||s.synchronizeCriteoUid(t.localStorageHelper,null===(i=t.gdprConsent)||void 0===i?void 0:i.consentData)}),this.userContextualDataManager=r||new Ae(e)}var Pe=function(){this.bids={},this.lineItemRanges=[],this.impIds=[]};var De,Oe,Be=(ke.prototype.push=function(){for(var t=[],e=0;e<arguments.length;e++)t[e]=arguments[e];for(var i=0,n=t;i<n.length;i++){var o=n[i];this.events.push(o)}this.evalEvents()},ke.prototype.evalEvents=function(){for(var t=0;t<this.events.length;){var e=this.events[t];if("conditionalEvent"!==e.name||e.canEval()){var i=this.events.splice(t,1);try{i[0].eval(this)}catch(t){R.Error("An exception occurred processing an event: "+t.toString())}}else t++}},ke.VERSION=O,ke);function ke(t){var e;void 0===t&&(t=null===(e=window.Criteo)||void 0===e?void 0:e.config),this.standaloneBidder=new Pe,this.events=[],this.context=new Me(document,window,void 0,void 0,t),R.Debug("Publisher Tag loaded")}function Fe(t){function e(){try{return i.apply(this,arguments)}catch(t){R.Error("Exception caught: "+t.toString())}}var i=t;for(var n in e.prototype=i.prototype,i)i.hasOwnProperty(n)&&(e[n]=i[n]);return e}window.criteo_pubtag&&"serviceProvider"in window.criteo_pubtag.context||(ce.LoadPolyfills(),window.criteo_pubtag=new Be),window.Criteo=function t(e){for(var i in e)if(i in e){var n=e[i];"function"==typeof n?e[i]=Fe(n):"object"==typeof n&&(e[i]=t(n))}return e}({PubTag:{Adapters:{Prebid:Bt},DirectBidding:{DirectBiddingEvent:ne,DirectBiddingSlot:tt,DirectBiddingUrlBuilder:z,Size:st}},events:window.Criteo?window.Criteo.events:[],passbackEvents:window.Criteo?window.Criteo.passbackEvents:[],usePrebidEvents:!window.Criteo||window.Criteo.usePrebidEvents}),!1!==window.Criteo.usePrebidEvents&&(window.Criteo.events=(De=window.Criteo.events,Oe={push:function(){for(var t=[],e=0;e<arguments.length;e++)t[e]=arguments[e];if(void 0!==t)for(var i=0,n=t;i<n.length;i++){var o=n[i];"function"==typeof o&&Fe(o)()}}},De&&Array.isArray(De)&&Oe.push.apply(Oe,De),Oe)),window.criteo_pubtag.context.serviceProvider.getServicesAsync(function(t){var e,i,n;e=t.localStorageHelper,n=re[i="prebid"],null===e.getItem(n,864e5)&&new Ft("https://static.criteo.net/js/ld/publishertag."+i+".js",void 0,void 0,!1).send(function(t){e.setItem(n,t,864e5)},function(t,e){R.Error("Could not update FastBid"+(e?" ("+e+")":""))})})}();</script><title>Java JRootPane - javatpoint</title><link rel="SHORTCUT ICON" href="https://static.javatpoint.com/images/favicon2.png">
<link rel="stylesheet" type="text/css" href="./JRootPaneExample_files/link.css" async=""><link rel="dns-prefetch" href="https://clients1.google.com/"><link rel="dns-prefetch" href="https://static.javatpoint.com/"><link rel="dns-prefetch" href="https://googleads.g.doubleclick.net/"><link rel="dns-prefetch" href="https://www.google.com/"><link rel="dns-prefetch" href="https://feedify.net/"><meta name="theme-color" content="#4CAF50"><meta property="og:title" content="Java JRootPane - javatpoint"><meta property="og:description" content="Java JRootPane example with topics on JButton, diifference between AWT and swing, JRadioButton, JTextField, JTextArea, JList, JColorChooser, JSlider, JMenu, JPanel, JTable, JCheckBox, javax.swing package etc.">
<meta name="keywords" content="java, swing, tutorial, example, javax.swing, package"><meta name="description" content="Java JRootPane example with topics on JButton, diifference between AWT and swing, JRadioButton, JTextField, JTextArea, JList, JColorChooser, JSlider, JMenu, JPanel, JTable, JCheckBox, javax.swing package etc."><meta name="viewport" content="width=device-width, initial-scale=1.0"><meta name="apple-mobile-web-app-capable" content="yes"><meta name="apple-mobile-web-app-status-bar-style" content="black"><link rel="canonical" href="https://www.javatpoint.com/java-jrootpane">
<meta property="og:locale" content="en_US"><meta property="og:type" content="article"><meta name="twitter:title" property="og:title" content="Java JRootPane - javatpoint"><meta name="twitter:description" property="og:description" content="Java JRootPane example with topics on JButton, diifference between AWT and swing, JRadioButton, JTextField, JTextArea, JList, JColorChooser, JSlider, JMenu, JPanel, JTable, JCheckBox, javax.swing package etc."><meta property="og:url" content="https://www.javatpoint.com/java-jrootpane"><meta property="og:site_name" content="www.javatpoint.com"><meta name="twitter:card" content="summary"><meta name="twitter:site" content="@pagejavatpoint"><meta name="twitter:domain" content="www.javatpoint.com"><meta name="twitter:creator" content="@pagejavatpoint">

 
<link href="https://www.javatpoint.com/manifest.json" rel="manifest">
<script type="text/javascript" async="" src="./JRootPaneExample_files/ga.js.download"></script><script src="./JRootPaneExample_files/f(5).txt" id="google_shimpl"></script><script type="text/javascript" async="" src="./JRootPaneExample_files/f(6).txt"></script><script type="text/javascript" async="" src="./JRootPaneExample_files/f(6).txt"></script><script data-cfasync="false" type="text/javascript">(function(w, d) { var s = d.createElement('script'); s.src = '//delivery.adrecover.com/37784/adRecover.js?ts=1543562646174'; s.type = 'text/javascript'; s.async = true; (d.getElementsByTagName('head')[0] || d.getElementsByTagName('body')[0]).appendChild(s); })(window, document);</script><script src="./JRootPaneExample_files/adRecover.js.download" type="text/javascript" async=""></script>
<script data-cfasync="false" type="text/javascript">(function(w, d) { var s = d.createElement('script'); s.src = '//cdn.adpushup.com/37780/adpushup.js'; s.type = 'text/javascript'; s.async = true; (d.getElementsByTagName('head')[0] || d.getElementsByTagName('body')[0]).appendChild(s); })(window, document);</script><script src="./JRootPaneExample_files/adpushup.js.download" type="text/javascript" async=""></script>
<script type="text/javascript" async="" src="./JRootPaneExample_files/jquery.min.js.download"></script><meta http-equiv="origin-trial" content="A1H+PzQW00tt6dlReHFzfO4EtBaEtEImIF9ZNiF54JpDi1bO6/7PK96Q0qxy017wgzSy9ByDKoju2mo57DH+MwoAAAB7eyJvcmlnaW4iOiJodHRwczovL2RvdWJsZWNsaWNrLm5ldDo0NDMiLCJmZWF0dXJlIjoiVHJ1c3RUb2tlbnMiLCJleHBpcnkiOjE2MTAzOTg0NTIsImlzU3ViZG9tYWluIjp0cnVlLCJpc1RoaXJkUGFydHkiOnRydWV9"><script type="text/javascript" async="" src="./JRootPaneExample_files/pb.1607067690348.js.download"></script><script type="text/javascript">if((adpushup.config.platform && adpushup.config.platform.toLowerCase()) === "mobile"){ 
(function () {
      window.googletag = window.googletag || { cmd: [] };
    
      var interstitialSlot;
      googletag.cmd.push(function () {
    
        interstitialSlot = googletag.defineOutOfPageSlot(
          '/103512698/22195958483',
          googletag.enums.OutOfPageFormat.INTERSTITIAL);
    
        // returns null if the device do not supports web interstitial ads.
        if (interstitialSlot) {
          sendFeedback();
          interstitialSlot.addService(googletag.pubads());
          
          // adding targeting adpushup_ran = 1
          if(googletag.pubads().setTargeting("adpushup_ran", "1") && googletag.pubads().setTargeting("da","adx")){
            adpushup.utils.log("Targeting set successfully");
          } 
          
          googletag.pubads().addEventListener('slotOnload', function (event) {
            if (interstitialSlot === event.slot) {
              adpushup.utils.log('Interstitial Loaded Successfully');
            }
          });
          requestSlotWhenPubadsReady();
        }
    
      });
    
      function sendFeedback() {
        const data = {
          createdTS: Date.now(),
          packetId: window.adpushup.config.packetId,
          siteId: window.adpushup.config.siteId,
          siteDomain: window.adpushup.config.siteDomain,
          url: window.adpushup.config.pageUrl,
          mode: window.adpushup.config.mode,
          errorCode: 1,
          referrer: '',
          pageGroup: window.adpushup.config.pageGroup,
          pageVariationId: window.adpushup.config.selectedVariation,
          pageVariationName: 'Adx',
          pageVariationType: 1,
          platform: 'MOBILE',
          isGeniee: false,
          sections: [
            {
              sectionId: 'cfd78d12-f92e-4af5-bfd1-975592ddc5fa',
              sectionName: 'AP_T_M_336X280_cfd78',
              status: 1,
              network: 'adpTags',
              networkAdUnitId: 'ADP_37780_336X280_cfd78d12-f92e-4af5-bfd1-975592ddc5fa',
              services: [2],
              adUnitType: 1
            }
          ]
        };
        const encodedData = '//e3.adpushup.com/AdPushupFeedbackWebService/feedback?data=' + btoa(JSON.stringify(data));
        document.createElement("img").src = encodedData;
      }
    
      function requestSlotWhenPubadsReady() {
        var googletag = window.googletag || { cmd: [] };
        if (!googletag.pubadsReady) {
            
            setTimeout(requestSlotWhenPubadsReady, 0);
        } else {
            googletag.pubads().refresh([interstitialSlot]);
        }
      }
    })();

(function () {
      window.googletag = window.googletag || { cmd: [] };
    
      var interstitialSlot;
      googletag.cmd.push(function () {
    
        interstitialSlot = googletag.defineOutOfPageSlot(
          '/103512698/22196561536',
          googletag.enums.OutOfPageFormat.INTERSTITIAL);
    
        // returns null if the device do not supports web interstitial ads.
        if (interstitialSlot) {
          sendFeedback();
          interstitialSlot.addService(googletag.pubads());
          
          // adding targeting adpushup_ran = 1
          if(googletag.pubads().setTargeting("adpushup_ran", "1") && googletag.pubads().setTargeting("da","adx")){
            adpushup.utils.log("Targeting set successfully");
          } 
          
          googletag.pubads().addEventListener('slotOnload', function (event) {
            if (interstitialSlot === event.slot) {
              adpushup.utils.log('Interstitial Loaded Successfully');
            }
          });
          requestSlotWhenPubadsReady();
        }
    
      });
    
      function sendFeedback() {
        const data = {
          createdTS: Date.now(),
          packetId: window.adpushup.config.packetId,
          siteId: window.adpushup.config.siteId,
          siteDomain: window.adpushup.config.siteDomain,
          url: window.adpushup.config.pageUrl,
          mode: window.adpushup.config.mode,
          errorCode: 1,
          referrer: '',
          pageGroup: window.adpushup.config.pageGroup,
          pageVariationId: window.adpushup.config.selectedVariation,
          pageVariationName: 'Adx',
          pageVariationType: 1,
          platform: 'MOBILE',
          isGeniee: false,
          sections: [
            {
              sectionId: '221492f5-94a7-4654-937e-8f022b62baba',
              sectionName: 'AP_T_M_336X280_22149',
              status: 1,
              network: 'adpTags',
              networkAdUnitId: 'ADP_37780_336X280_221492f5-94a7-4654-937e-8f022b62baba',
              services: [2],
              adUnitType: 1
            }
          ]
        };
        const encodedData = '//e3.adpushup.com/AdPushupFeedbackWebService/feedback?data=' + btoa(JSON.stringify(data));
        document.createElement("img").src = encodedData;
      }
    
      function requestSlotWhenPubadsReady() {
        var googletag = window.googletag || { cmd: [] };
        if (!googletag.pubadsReady) {
            
            setTimeout(requestSlotWhenPubadsReady, 0);
        } else {
            googletag.pubads().refresh([interstitialSlot]);
        }
      }
    })();
}

(function() {
    function logEvent(event, data) {
        console.log({
            data
        })
        var logData = Object.assign({}, {
            [event]: data
        });
        var keenUrl =
            "https://api.keen.io/3.0/projects/5f809ca42bd0aa489395409a/events?api_key=8f1331388a743b183d150f3e5a0641ce00abe847a4cb3e3ed8539070cc0ff84470a3be7d191839f0c993f15e215d0dced7b0d2084cdc3b34db295ecef111f134857f2a669bd8c28a59f0a8a4e0bd55929b647ae9b840f5481b1d0bbf059f7526";
        var xhttp = new XMLHttpRequest();
        xhttp.open("POST", keenUrl, true);
        xhttp.setRequestHeader("Content-Type", "application/json");
        xhttp.send(JSON.stringify(logData));
        window.adpushup.utils.log(logData);
    }
    var apLogSent = false;
    _apPbJs = window._apPbJs || {
        que: []
    };
    _apPbJs.que.push(function() {
        var bidResponses = {};
        _apPbJs.onEvent('auctionEnd', function(auctionResponse) {
            if (apLogSent) {
                return;
            }
            var bidsReceived = auctionResponse.bidsReceived;
            for (var i = 0; i < bidsReceived.length; i++) {
                var bid = bidsReceived[i];
                var currency = bid.currency;
                var originalCurrency = bid.originalCurrency;
                var bidder = bid.bidderCode;
                if (!bidResponses[bidder]) {
                    bidResponses[bidder] = [];
                }
                var alreadyExist = false;
                for (var j = 0; j < bidResponses[bidder].length; j++) {
                    if (bidResponses[bidder][j].currency == currency && bidResponses[bidder][j].originalCurrency == originalCurrency) {
                        alreadyExist = true;
                        break;
                    }
                }
                if (!alreadyExist) {
                    bidResponses[bidder].push({
                        currency,
                        originalCurrency
                    })
                }
            }
            var data = [];
            var bidders = Object.keys(bidResponses);
            for (var i = 0; i < bidders.length; i++) {
                var bidder = bidders[i];
                var bids = bidResponses[bidder];
                for (var j = 0; j < bids.length; j++) {
                    var currency = bids[j].currency;
                    var originalCurrency = bids[j].originalCurrency;
                    data.push({
                        bidder,
                        currency,
                        originalCurrency,
                        country: window.adpushup.config.country
                    })
                }
            }
            logEvent('prebid_currency_log', data);
            apLogSent = true;
        });
    })
})();</script><script src="./JRootPaneExample_files/gpt.js.download" async=""></script><script async="" src="./JRootPaneExample_files/apstag.js.download"></script><script type="text/javascript">(function($){ 

 })(adpushup.$)</script><style type="text/css">.dp-j .annotation { color: #646464; }.dp-j .number { color: #C00000; }</style><script src="./JRootPaneExample_files/cse_element__en.js.download" type="text/javascript"></script><link type="text/css" rel="stylesheet" href="./JRootPaneExample_files/default+en.css"><link type="text/css" rel="stylesheet" href="./JRootPaneExample_files/espresso.css"><script src="./JRootPaneExample_files/cse_element__en.js.download" type="text/javascript"></script><link type="text/css" rel="stylesheet" href="./JRootPaneExample_files/default+en.css"><link type="text/css" rel="stylesheet" href="./JRootPaneExample_files/espresso.css"><script src="./JRootPaneExample_files/pubads_impl_2020120801.js.download" async=""></script><link rel="preload" href="./JRootPaneExample_files/f(7).txt" as="script"><script type="text/javascript" src="./JRootPaneExample_files/f(7).txt"></script><link rel="preload" href="./JRootPaneExample_files/f(8).txt" as="script"><script type="text/javascript" src="./JRootPaneExample_files/f(8).txt"></script><style type="text/css">.gsc-control-cse{font-family:georgia, arial, serif}.gsc-control-cse .gsc-table-result{font-family:georgia, arial, serif}.gsc-refinementsGradient{background:linear-gradient(to left,rgba(255,255,255,1),rgba(255,255,255,0))}.gsc-control-cse{border-color:#FFFFFF;background-color:#FFFFFF}input.gsc-input,.gsc-input-box,.gsc-input-box-hover,.gsc-input-box-focus{border-color:#D3BCA1}.gsc-search-button-v2,.gsc-search-button-v2:hover,.gsc-search-button-v2:focus{border-color:#300D00;background-color:#461200;background-image:none;filter:none}.gsc-search-button-v2 svg{fill:#FFFFFF}.gsc-tabHeader.gsc-tabhActive,.gsc-refinementHeader.gsc-refinementhActive{color:#461200;border-color:#461200;background-color:#FFFFFF}.gsc-tabHeader.gsc-tabhInactive,.gsc-refinementHeader.gsc-refinementhInactive{color:#950000;border-color:#950000;background-color:#FFFFFF}.gsc-webResult.gsc-result,.gsc-results .gsc-imageResult{border-color:#FFFFFF;background-color:#FFFFFF}.gsc-webResult.gsc-result:hover{border-color:#FFFFFF;background-color:#FFFFFF}.gs-webResult.gs-result a.gs-title:link,.gs-webResult.gs-result a.gs-title:link b,.gs-imageResult a.gs-title:link,.gs-imageResult a.gs-title:link b{color:#950000}.gs-webResult.gs-result a.gs-title:visited,.gs-webResult.gs-result a.gs-title:visited b,.gs-imageResult a.gs-title:visited,.gs-imageResult a.gs-title:visited b{color:#950000}.gs-webResult.gs-result a.gs-title:hover,.gs-webResult.gs-result a.gs-title:hover b,.gs-imageResult a.gs-title:hover,.gs-imageResult a.gs-title:hover b{color:#950000}.gs-webResult.gs-result a.gs-title:active,.gs-webResult.gs-result a.gs-title:active b,.gs-imageResult a.gs-title:active,.gs-imageResult a.gs-title:active b{color:#950000}.gsc-cursor-page{color:#950000}a.gsc-trailing-more-results:link{color:#950000}.gs-webResult:not(.gs-no-results-result):not(.gs-error-result) .gs-snippet,.gs-fileFormatType{color:#333333}.gs-webResult div.gs-visibleUrl{color:#A25B08}.gs-webResult div.gs-visibleUrl-short{color:#A25B08}.gsc-cursor-box{border-color:#FFFFFF}.gsc-results .gsc-cursor-box .gsc-cursor-page{border-color:#950000;background-color:#FFFFFF;color:#950000}.gsc-results .gsc-cursor-box .gsc-cursor-current-page{border-color:#461200;background-color:#FFFFFF;color:#461200}.gsc-webResult.gsc-result.gsc-promotion{border-color:#FEFEDC;background-color:#FFFFCC}.gsc-completion-title{color:#950000}.gsc-completion-snippet{color:#333333}.gs-promotion a.gs-title:link,.gs-promotion a.gs-title:link *,.gs-promotion .gs-snippet a:link{color:#0000CC}.gs-promotion a.gs-title:visited,.gs-promotion a.gs-title:visited *,.gs-promotion .gs-snippet a:visited{color:#0000CC}.gs-promotion a.gs-title:hover,.gs-promotion a.gs-title:hover *,.gs-promotion .gs-snippet a:hover{color:#0000CC}.gs-promotion a.gs-title:active,.gs-promotion a.gs-title:active *,.gs-promotion .gs-snippet a:active{color:#0000CC}.gs-promotion .gs-snippet,.gs-promotion .gs-title .gs-promotion-title-right,.gs-promotion .gs-title .gs-promotion-title-right *{color:#333333}.gs-promotion .gs-visibleUrl,.gs-promotion .gs-visibleUrl-short{color:#A25B08}.gcsc-find-more-on-google{color:#950000}.gcsc-find-more-on-google-magnifier{fill:#950000}</style><style type="text/css">.gscb_a{display:inline-block;font:27px/13px arial,sans-serif}.gsst_a .gscb_a{color:#a1b9ed;cursor:pointer}.gsst_a:hover .gscb_a,.gsst_a:focus .gscb_a{color:#36c}.gsst_a{display:inline-block}.gsst_a{cursor:pointer;padding:0 4px}.gsst_a:hover{text-decoration:none!important}.gsst_b{font-size:16px;padding:0 2px;position:relative;user-select:none;-webkit-user-select:none;white-space:nowrap}.gsst_e{vertical-align:middle;opacity:0.55;}.gsst_a:hover .gsst_e,.gsst_a:focus .gsst_e{opacity:0.72;}.gsst_a:active .gsst_e{opacity:1;}.gsst_f{background:white;text-align:left}.gsst_g{background-color:white;border:1px solid #ccc;border-top-color:#d9d9d9;box-shadow:0 2px 4px rgba(0,0,0,0.2);-webkit-box-shadow:0 2px 4px rgba(0,0,0,0.2);margin:-1px -3px;padding:0 6px}.gsst_h{background-color:white;height:1px;margin-bottom:-1px;position:relative;top:-1px}.gsib_a{width:100%;padding:4px 6px 0}.gsib_a,.gsib_b{vertical-align:top}.gssb_c{border:0;position:absolute;z-index:989}.gssb_e{border:1px solid #ccc;border-top-color:#d9d9d9;box-shadow:0 2px 4px rgba(0,0,0,0.2);-webkit-box-shadow:0 2px 4px rgba(0,0,0,0.2);cursor:default}.gssb_f{visibility:hidden;white-space:nowrap}.gssb_k{border:0;display:block;position:absolute;top:0;z-index:988}.gsdd_a{border:none!important}.gsq_a{padding:0}.gssb_a{padding:0 7px}.gssb_a,.gssb_a td{white-space:nowrap;overflow:hidden;line-height:22px}#gssb_b{font-size:11px;color:#36c;text-decoration:none}#gssb_b:hover{font-size:11px;color:#36c;text-decoration:underline}.gssb_g{text-align:center;padding:8px 0 7px;position:relative}.gssb_h{font-size:15px;height:28px;margin:0.2em;-webkit-appearance:button}.gssb_i{background:#eee}.gss_ifl{visibility:hidden;padding-left:5px}.gssb_i .gss_ifl{visibility:visible}a.gssb_j{font-size:13px;color:#36c;text-decoration:none;line-height:100%}a.gssb_j:hover{text-decoration:underline}.gssb_l{height:1px;background-color:#e5e5e5}.gssb_m{color:#000;background:#fff}.gssb_a{padding:0 9px}.gsib_a{padding:5px 9px 4px 9px}.gscb_a{line-height:27px}.gssb_e{border:0}.gssb_l{margin:5px 0}input.gsc-input::-webkit-input-placeholder{font-size:14px}input.gsc-input:-moz-placeholder{font-size:14px}input.gsc-input::-moz-placeholder{font-size:14px}input.gsc-input:-ms-input-placeholder{font-size:14px}input.gsc-input:focus::-webkit-input-placeholder{color:transparent}input.gsc-input:focus:-moz-placeholder{color:transparent}input.gsc-input:focus::-moz-placeholder{color:transparent}input.gsc-input:focus:-ms-input-placeholder{color:transparent}.gssb_c .gsc-completion-container{position:static}.gssb_c{z-index:5000}.gsc-completion-container table{background:transparent;font-size:inherit;font-family:inherit}.gssb_c > tbody > tr,.gssb_c > tbody > tr > td,.gssb_d,.gssb_d > tbody > tr,.gssb_d > tbody > tr > td,.gssb_e,.gssb_e > tbody > tr,.gssb_e > tbody > tr > td{padding:0;margin:0;border:0}.gssb_a table,.gssb_a table tr,.gssb_a table tr td{padding:0;margin:0;border:0}</style><style type="text/css">.gscb_a{display:inline-block;font:27px/13px arial,sans-serif}.gsst_a .gscb_a{color:#a1b9ed;cursor:pointer}.gsst_a:hover .gscb_a,.gsst_a:focus .gscb_a{color:#36c}.gsst_a{display:inline-block}.gsst_a{cursor:pointer;padding:0 4px}.gsst_a:hover{text-decoration:none!important}.gsst_b{font-size:16px;padding:0 2px;position:relative;user-select:none;-webkit-user-select:none;white-space:nowrap}.gsst_e{vertical-align:middle;opacity:0.55;}.gsst_a:hover .gsst_e,.gsst_a:focus .gsst_e{opacity:0.72;}.gsst_a:active .gsst_e{opacity:1;}.gsst_f{background:white;text-align:left}.gsst_g{background-color:white;border:1px solid #ccc;border-top-color:#d9d9d9;box-shadow:0 2px 4px rgba(0,0,0,0.2);-webkit-box-shadow:0 2px 4px rgba(0,0,0,0.2);margin:-1px -3px;padding:0 6px}.gsst_h{background-color:white;height:1px;margin-bottom:-1px;position:relative;top:-1px}.gsib_a{width:100%;padding:4px 6px 0}.gsib_a,.gsib_b{vertical-align:top}.gssb_c{border:0;position:absolute;z-index:989}.gssb_e{border:1px solid #ccc;border-top-color:#d9d9d9;box-shadow:0 2px 4px rgba(0,0,0,0.2);-webkit-box-shadow:0 2px 4px rgba(0,0,0,0.2);cursor:default}.gssb_f{visibility:hidden;white-space:nowrap}.gssb_k{border:0;display:block;position:absolute;top:0;z-index:988}.gsdd_a{border:none!important}.gsq_a{padding:0}.gssb_a{padding:0 7px}.gssb_a,.gssb_a td{white-space:nowrap;overflow:hidden;line-height:22px}#gssb_b{font-size:11px;color:#36c;text-decoration:none}#gssb_b:hover{font-size:11px;color:#36c;text-decoration:underline}.gssb_g{text-align:center;padding:8px 0 7px;position:relative}.gssb_h{font-size:15px;height:28px;margin:0.2em;-webkit-appearance:button}.gssb_i{background:#eee}.gss_ifl{visibility:hidden;padding-left:5px}.gssb_i .gss_ifl{visibility:visible}a.gssb_j{font-size:13px;color:#36c;text-decoration:none;line-height:100%}a.gssb_j:hover{text-decoration:underline}.gssb_l{height:1px;background-color:#e5e5e5}.gssb_m{color:#000;background:#fff}.gssb_a{padding:0 9px}.gsib_a{padding:5px 9px 4px 9px}.gscb_a{line-height:27px}.gssb_e{border:0}.gssb_l{margin:5px 0}input.gsc-input::-webkit-input-placeholder{font-size:14px}input.gsc-input:-moz-placeholder{font-size:14px}input.gsc-input::-moz-placeholder{font-size:14px}input.gsc-input:-ms-input-placeholder{font-size:14px}input.gsc-input:focus::-webkit-input-placeholder{color:transparent}input.gsc-input:focus:-moz-placeholder{color:transparent}input.gsc-input:focus::-moz-placeholder{color:transparent}input.gsc-input:focus:-ms-input-placeholder{color:transparent}.gssb_c .gsc-completion-container{position:static}.gssb_c{z-index:5000}.gsc-completion-container table{background:transparent;font-size:inherit;font-family:inherit}.gssb_c > tbody > tr,.gssb_c > tbody > tr > td,.gssb_d,.gssb_d > tbody > tr,.gssb_d > tbody > tr > td,.gssb_e,.gssb_e > tbody > tr,.gssb_e > tbody > tr > td{padding:0;margin:0;border:0}.gssb_a table,.gssb_a table tr,.gssb_a table tr td{padding:0;margin:0;border:0}</style><style type="text/css">.gsc-control-cse{font-family:georgia, arial, serif}.gsc-control-cse .gsc-table-result{font-family:georgia, arial, serif}.gsc-refinementsGradient{background:linear-gradient(to left,rgba(255,255,255,1),rgba(255,255,255,0))}.gsc-control-cse{border-color:#FFFFFF;background-color:#FFFFFF}input.gsc-input,.gsc-input-box,.gsc-input-box-hover,.gsc-input-box-focus{border-color:#D3BCA1}.gsc-search-button-v2,.gsc-search-button-v2:hover,.gsc-search-button-v2:focus{border-color:#300D00;background-color:#461200;background-image:none;filter:none}.gsc-search-button-v2 svg{fill:#FFFFFF}.gsc-tabHeader.gsc-tabhActive,.gsc-refinementHeader.gsc-refinementhActive{color:#461200;border-color:#461200;background-color:#FFFFFF}.gsc-tabHeader.gsc-tabhInactive,.gsc-refinementHeader.gsc-refinementhInactive{color:#950000;border-color:#950000;background-color:#FFFFFF}.gsc-webResult.gsc-result,.gsc-results .gsc-imageResult{border-color:#FFFFFF;background-color:#FFFFFF}.gsc-webResult.gsc-result:hover{border-color:#FFFFFF;background-color:#FFFFFF}.gs-webResult.gs-result a.gs-title:link,.gs-webResult.gs-result a.gs-title:link b,.gs-imageResult a.gs-title:link,.gs-imageResult a.gs-title:link b{color:#950000}.gs-webResult.gs-result a.gs-title:visited,.gs-webResult.gs-result a.gs-title:visited b,.gs-imageResult a.gs-title:visited,.gs-imageResult a.gs-title:visited b{color:#950000}.gs-webResult.gs-result a.gs-title:hover,.gs-webResult.gs-result a.gs-title:hover b,.gs-imageResult a.gs-title:hover,.gs-imageResult a.gs-title:hover b{color:#950000}.gs-webResult.gs-result a.gs-title:active,.gs-webResult.gs-result a.gs-title:active b,.gs-imageResult a.gs-title:active,.gs-imageResult a.gs-title:active b{color:#950000}.gsc-cursor-page{color:#950000}a.gsc-trailing-more-results:link{color:#950000}.gs-webResult:not(.gs-no-results-result):not(.gs-error-result) .gs-snippet,.gs-fileFormatType{color:#333333}.gs-webResult div.gs-visibleUrl{color:#A25B08}.gs-webResult div.gs-visibleUrl-short{color:#A25B08}.gsc-cursor-box{border-color:#FFFFFF}.gsc-results .gsc-cursor-box .gsc-cursor-page{border-color:#950000;background-color:#FFFFFF;color:#950000}.gsc-results .gsc-cursor-box .gsc-cursor-current-page{border-color:#461200;background-color:#FFFFFF;color:#461200}.gsc-webResult.gsc-result.gsc-promotion{border-color:#FEFEDC;background-color:#FFFFCC}.gsc-completion-title{color:#950000}.gsc-completion-snippet{color:#333333}.gs-promotion a.gs-title:link,.gs-promotion a.gs-title:link *,.gs-promotion .gs-snippet a:link{color:#0000CC}.gs-promotion a.gs-title:visited,.gs-promotion a.gs-title:visited *,.gs-promotion .gs-snippet a:visited{color:#0000CC}.gs-promotion a.gs-title:hover,.gs-promotion a.gs-title:hover *,.gs-promotion .gs-snippet a:hover{color:#0000CC}.gs-promotion a.gs-title:active,.gs-promotion a.gs-title:active *,.gs-promotion .gs-snippet a:active{color:#0000CC}.gs-promotion .gs-snippet,.gs-promotion .gs-title .gs-promotion-title-right,.gs-promotion .gs-title .gs-promotion-title-right *{color:#333333}.gs-promotion .gs-visibleUrl,.gs-promotion .gs-visibleUrl-short{color:#A25B08}.gcsc-find-more-on-google{color:#950000}.gcsc-find-more-on-google-magnifier{fill:#950000}</style></head>  
<body onload="highlightlink()"> 
 
<button onclick="topFunction()" id="myBtn" title="Go to top" style="display: block;">&#8679;</button>
<div id="page" style="margin: -8px; background-color: rgb(245, 245, 244); height: auto !important;"><div id="container" style="height: auto !important;"> <div class="header"><table style="width:100%;margin-bottom:5px"> <tbody><tr> <td> <div style="clear:both;float:left;width:230px;margin-top:15px;margin-left:20px"> <a href="https://www.javatpoint.com/"><img src="./JRootPaneExample_files/jtp_logo.png" alt="Javatpoint Logo"></a> </div> <div style="float:left;width:60%;"><script> (function() { var cx = '005383125436438536544:y1edweedxwi'; var gcse = document.createElement('script'); gcse.type = 'text/javascript'; gcse.async = true; gcse.src = 'https://cse.google.com/cse.js?cx=' + cx; var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(gcse, s); })();</script><div id="___gcse_0"><div class="gsc-control-cse gsc-control-cse-en"><div class="gsc-control-wrapper-cse" dir="ltr"><form class="gsc-search-box gsc-search-box-tools" accept-charset="utf-8"><table cellspacing="0" cellpadding="0" class="gsc-search-box"><tbody><tr><td class="gsc-input"><div class="gsc-input-box" id="gsc-iw-id1"><table cellspacing="0" cellpadding="0" id="gs_id50" class="gstl_50 gsc-input" style="width: 100%; padding: 0px;"><tbody><tr><td id="gs_tti50" class="gsib_a"><input autocomplete="off" type="text" size="10" class="gsc-input" name="search" title="search" id="gsc-i-id1" dir="ltr" spellcheck="false" style="width: 100%; padding: 0px; border: none; margin: 0px; height: auto; outline: none;"></td><td class="gsib_b"><div class="gsst_b" id="gs_st50" dir="ltr"><a class="gsst_a" href="javascript:void(0)" title="Clear search box" role="button" style="display: none;"><span class="gscb_a" id="gs_cb50" aria-hidden="true">×</span></a></div></td></tr></tbody></table></div></td><td class="gsc-search-button"><button class="gsc-search-button gsc-search-button-v2"><svg width="13" height="13" viewBox="0 0 13 13"><title>search</title><path d="m4.8495 7.8226c0.82666 0 1.5262-0.29146 2.0985-0.87438 0.57232-0.58292 0.86378-1.2877 0.87438-2.1144 0.010599-0.82666-0.28086-1.5262-0.87438-2.0985-0.59352-0.57232-1.293-0.86378-2.0985-0.87438-0.8055-0.010599-1.5103 0.28086-2.1144 0.87438-0.60414 0.59352-0.8956 1.293-0.87438 2.0985 0.021197 0.8055 0.31266 1.5103 0.87438 2.1144 0.56172 0.60414 1.2665 0.8956 2.1144 0.87438zm4.4695 0.2115 3.681 3.6819-1.259 1.284-3.6817-3.7 0.0019784-0.69479-0.090043-0.098846c-0.87973 0.76087-1.92 1.1413-3.1207 1.1413-1.3553 0-2.5025-0.46363-3.4417-1.3909s-1.4088-2.0686-1.4088-3.4239c0-1.3553 0.4696-2.4966 1.4088-3.4239 0.9392-0.92727 2.0864-1.3969 3.4417-1.4088 1.3553-0.011889 2.4906 0.45771 3.406 1.4088 0.9154 0.95107 1.379 2.0924 1.3909 3.4239 0 1.2126-0.38043 2.2588-1.1413 3.1385l0.098834 0.090049z"></path></svg></button></td><td class="gsc-clear-button"><div class="gsc-clear-button" title="clear results">&nbsp;</div></td></tr></tbody></table></form><div class="gsc-results-wrapper-nooverlay"><div class="gsc-positioningWrapper"><div class="gsc-tabsAreaInvisible"><div aria-label="refinement" role="tab" class="gsc-tabHeader gsc-inline-block gsc-tabhActive">Custom Search</div><span class="gs-spacer"> </span></div></div><div class="gsc-positioningWrapper"><div class="gsc-tabsAreaInvisible"></div></div><div class="gsc-above-wrapper-area-invisible"><table cellspacing="0" cellpadding="0" class="gsc-above-wrapper-area-container"><tbody><tr><td class="gsc-result-info-container"><div class="gsc-result-info-invisible"></div></td><td class="gsc-orderby-container"><div class="gsc-orderby-invisible"><div class="gsc-orderby-label gsc-inline-block">Sort by:</div><div class="gsc-option-menu-container gsc-inline-block"><div class="gsc-selected-option-container gsc-inline-block"><div class="gsc-selected-option">Relevance</div><div class="gsc-option-selector"></div></div><div class="gsc-option-menu-invisible"><div class="gsc-option-menu-item gsc-option-menu-item-highlighted"><div class="gsc-option">Relevance</div></div><div class="gsc-option-menu-item"><div class="gsc-option">Date</div></div></div></div></div></td></tr></tbody></table></div><div class="gsc-adBlockInvisible"></div><div class="gsc-wrapper"><div class="gsc-adBlockInvisible"></div><div class="gsc-resultsbox-invisible"><div class="gsc-resultsRoot gsc-tabData gsc-tabdActive"><div><div class="gsc-expansionArea"></div></div></div></div></div></div></div></div></div> </div> </td> </tr></tbody></table> </div>
<div class="headermobile">
<div style="margin-top:10px;padding:0px;text-align:left;">
<span style="float:left"><input type="image" src="./JRootPaneExample_files/menuhome64.png" alt="Go To Top" onclick="showmenu()"></span>
<span style="float:left"><a href="https://www.javatpoint.com/"><img src="./JRootPaneExample_files/jtp_logo(1).png" alt="Javatpoint Logo"></a></span>

</div>
<div style="margin:0px;padding:0px;clear:both">
<script>
  (function() {
    var cx = '005383125436438536544:y1edweedxwi';
    var gcse = document.createElement('script');
    gcse.type = 'text/javascript';
    gcse.async = true;
    gcse.src = 'https://cse.google.com/cse.js?cx=' + cx;
    var s = document.getElementsByTagName('script')[0];
    s.parentNode.insertBefore(gcse, s);
  })();
</script>
<div id="___gcse_1"><div class="gsc-control-cse gsc-control-cse-en"><div class="gsc-control-wrapper-cse" dir="ltr"><form class="gsc-search-box gsc-search-box-tools" accept-charset="utf-8"><table cellspacing="0" cellpadding="0" class="gsc-search-box"><tbody><tr><td class="gsc-input"><div class="gsc-input-box" id="gsc-iw-id2"><table cellspacing="0" cellpadding="0" id="gs_id51" class="gstl_51 gsc-input" style="width: 100%; padding: 0px;"><tbody><tr><td id="gs_tti51" class="gsib_a"><input autocomplete="off" type="text" size="10" class="gsc-input" name="search" title="search" id="gsc-i-id2" dir="ltr" spellcheck="false" style="width: 100%; padding: 0px; border: none; margin: 0px; height: auto; outline: none;"></td><td class="gsib_b"><div class="gsst_b" id="gs_st51" dir="ltr"><a class="gsst_a" href="javascript:void(0)" title="Clear search box" role="button" style="display: none;"><span class="gscb_a" id="gs_cb51" aria-hidden="true">×</span></a></div></td></tr></tbody></table></div></td><td class="gsc-search-button"><button class="gsc-search-button gsc-search-button-v2"><svg width="13" height="13" viewBox="0 0 13 13"><title>search</title><path d="m4.8495 7.8226c0.82666 0 1.5262-0.29146 2.0985-0.87438 0.57232-0.58292 0.86378-1.2877 0.87438-2.1144 0.010599-0.82666-0.28086-1.5262-0.87438-2.0985-0.59352-0.57232-1.293-0.86378-2.0985-0.87438-0.8055-0.010599-1.5103 0.28086-2.1144 0.87438-0.60414 0.59352-0.8956 1.293-0.87438 2.0985 0.021197 0.8055 0.31266 1.5103 0.87438 2.1144 0.56172 0.60414 1.2665 0.8956 2.1144 0.87438zm4.4695 0.2115 3.681 3.6819-1.259 1.284-3.6817-3.7 0.0019784-0.69479-0.090043-0.098846c-0.87973 0.76087-1.92 1.1413-3.1207 1.1413-1.3553 0-2.5025-0.46363-3.4417-1.3909s-1.4088-2.0686-1.4088-3.4239c0-1.3553 0.4696-2.4966 1.4088-3.4239 0.9392-0.92727 2.0864-1.3969 3.4417-1.4088 1.3553-0.011889 2.4906 0.45771 3.406 1.4088 0.9154 0.95107 1.379 2.0924 1.3909 3.4239 0 1.2126-0.38043 2.2588-1.1413 3.1385l0.098834 0.090049z"></path></svg></button></td><td class="gsc-clear-button"><div class="gsc-clear-button" title="clear results">&nbsp;</div></td></tr></tbody></table></form><div class="gsc-results-wrapper-nooverlay"><div class="gsc-positioningWrapper"><div class="gsc-tabsAreaInvisible"><div aria-label="refinement" role="tab" class="gsc-tabHeader gsc-inline-block gsc-tabhActive">Custom Search</div><span class="gs-spacer"> </span></div></div><div class="gsc-positioningWrapper"><div class="gsc-tabsAreaInvisible"></div></div><div class="gsc-above-wrapper-area-invisible"><table cellspacing="0" cellpadding="0" class="gsc-above-wrapper-area-container"><tbody><tr><td class="gsc-result-info-container"><div class="gsc-result-info-invisible"></div></td><td class="gsc-orderby-container"><div class="gsc-orderby-invisible"><div class="gsc-orderby-label gsc-inline-block">Sort by:</div><div class="gsc-option-menu-container gsc-inline-block"><div class="gsc-selected-option-container gsc-inline-block"><div class="gsc-selected-option">Relevance</div><div class="gsc-option-selector"></div></div><div class="gsc-option-menu-invisible"><div class="gsc-option-menu-item gsc-option-menu-item-highlighted"><div class="gsc-option">Relevance</div></div><div class="gsc-option-menu-item"><div class="gsc-option">Date</div></div></div></div></div></td></tr></tbody></table></div><div class="gsc-adBlockInvisible"></div><div class="gsc-wrapper"><div class="gsc-adBlockInvisible"></div><div class="gsc-resultsbox-invisible"><div class="gsc-resultsRoot gsc-tabData gsc-tabdActive"><div><div class="gsc-expansionArea"></div></div></div></div></div></div></div></div></div>
<!--<form class="navbar-search-m" method="get" action="https://www.google.com/search" target="_blank"> <input type="text" name="q" class="search-query span2-m" placeholder="Search on javatpoint..." title="Search on Javatpoint"/><input type="hidden" name="sitesearch" value="www.javatpoint.com"/></form>-->

</div>
</div>
<div id="link" style="clear:both"> <div id="smoothmenu1" class="ddsmoothmenu">
<ul>
<li><a href="https://www.javatpoint.com/">Home</a></li>
<li><a href="https://www.javatpoint.com/java-tutorial" class="selected">Java</a></li>
<li><a href="https://www.javatpoint.com/java-programs">Programs</a></li>
<li><a href="https://www.javatpoint.com/java-oops-concepts">OOPs</a></li>
<li><a href="https://www.javatpoint.com/java-string">String</a></li>
<li><a href="https://www.javatpoint.com/exception-handling-in-java">Exception</a></li>
<li><a href="https://www.javatpoint.com/multithreading-in-java">Multithreading</a></li>
<li><a href="https://www.javatpoint.com/collections-in-java">Collections</a></li>
<li><a href="https://www.javatpoint.com/java-jdbc">JDBC</a></li>
<li><a href="https://www.javatpoint.com/servlet-tutorial">Servlet</a></li>
<li><a href="https://www.javatpoint.com/jsp-tutorial">JSP</a></li>
<li><a href="https://www.javatpoint.com/spring-tutorial">Spring</a></li>
<li><a href="https://www.javatpoint.com/spring-boot-tutorial">Spring Boot</a></li>
<li><a href="https://www.javatpoint.com/android-tutorial">Android</a></li>
<li><a href="https://www.javatpoint.com/free-java-projects">Projects</a></li>
<li><a href="https://www.javatpoint.com/corejava-interview-questions">Interview Questions</a>
</li>
</ul>
<br style="clear: left">
</div>
</div>
<div class="mobilemenu" style="clear:both"> 
<!-- Cm_300x250_Mob_14/9 -->
<ins class="adPushupAds" data-adpcontrol="hqdgs" data-ver="2" data-siteid="37780" data-ac="PHNjcmlwdCBhc3luYyBzcmM9Ii8vcGFnZWFkMi5nb29nbGVzeW5kaWNhdGlvbi5jb20vcGFnZWFkL2pzL2Fkc2J5Z29vZ2xlLmpzIj48L3NjcmlwdD4KPCEtLSBDbV8zMDB4MjUwX01vYl8xNC85IC0tPgo8aW5zIGNsYXNzPSJhZHNieWdvb2dsZSIKICAgICBzdHlsZT0iZGlzcGxheTppbmxpbmUtYmxvY2s7d2lkdGg6MzAwcHg7aGVpZ2h0OjI1MHB4IgogICAgIGRhdGEtYWQtY2xpZW50PSJjYS1wdWItNDY5OTg1ODU0OTAyMzM4MiIKICAgICBkYXRhLWFkLXNsb3Q9IjcwMTQyNzI1MTkiPjwvaW5zPgo8c2NyaXB0PgooYWRzYnlnb29nbGUgPSB3aW5kb3cuYWRzYnlnb29nbGUgfHwgW10pLnB1c2goe30pOwo8L3NjcmlwdD4=" data-push="1"></ins><script data-cfasync="false" type="text/javascript">(function (w, d) { for (var i = 0, j = d.getElementsByTagName("ins"), k = j[i]; i < j.length; k = j[++i]){ if(k.className == "adPushupAds" && k.getAttribute("data-push") != "1") { ((w.adpushup = w.adpushup || {}).control = (w.adpushup.control || [])).push(k); k.setAttribute("data-push", "1");} } })(window, document);</script>
</div>

<div id="menu">
<div class="leftmenu2">
<a href="https://www.javatpoint.com/java-tutorial"><span>Basics of Java </span></a>
<a href="https://www.javatpoint.com/java-oops-concepts"><span>OOPs Concepts</span></a>
<a href="https://www.javatpoint.com/java-string"><span>Java String</span></a>
<a href="https://www.javatpoint.com/java-regex"><span>Java Regex</span></a>
<a href="https://www.javatpoint.com/exception-handling-in-java"><span>Exception Handling</span></a>
<a href="https://www.javatpoint.com/java-inner-class"><span>Java Inner classes</span></a>
<a href="https://www.javatpoint.com/multithreading-in-java"><span>Java Multithreading</span></a>
<a href="https://www.javatpoint.com/java-io"><span>Java I/O</span></a>
<a href="https://www.javatpoint.com/java-networking"><span>Java Networking</span></a>
<a href="https://www.javatpoint.com/java-awt"><span>Java AWT &amp; Events</span></a>
</div>
<div class="leftmenu2">
<h2 class="spanh2"><span class="spanh2">Java Swing</span></h2>
</div>
<div class="leftmenu">
<a href="https://www.javatpoint.com/java-swing" class="l1">Swing Introduction</a>
<a href="https://www.javatpoint.com/java-jbutton">Java JButton</a>
<a href="https://www.javatpoint.com/java-jlabel">Java JLabel</a>
<a href="https://www.javatpoint.com/java-jtextfield">Java JTextField</a>
<a href="https://www.javatpoint.com/java-jtextarea">Java JTextArea</a>
<a href="https://www.javatpoint.com/java-jpasswordfield">Java JPasswordField</a>
<a href="https://www.javatpoint.com/java-jcheckbox">Java JCheckBox</a>
<a href="https://www.javatpoint.com/java-jradiobutton">Java JRadioButton</a>
<a href="https://www.javatpoint.com/java-jcombobox">Java JComboBox</a>
<a href="https://www.javatpoint.com/java-jtable">Java JTable </a>
<a href="https://www.javatpoint.com/java-jlist">Java JList</a>
<a href="https://www.javatpoint.com/java-joptionpane">Java JOptionPane</a>
<a href="https://www.javatpoint.com/java-jscrollbar">Java JScrollBar</a>
<a href="https://www.javatpoint.com/java-jmenuitem-and-jmenu">Java JMenuItem &amp; JMenu</a>
<a href="https://www.javatpoint.com/java-jpopupmenu">Java JPopupMenu</a>
<a href="https://www.javatpoint.com/java-jcheckboxmenuitem">Java JCheckBoxMenuItem</a>

<a href="https://www.javatpoint.com/java-jseparator">Java JSeparator</a>
<a href="https://www.javatpoint.com/java-jprogressbar">Java JProgressBar</a>
<a href="https://www.javatpoint.com/java-jtree">Java JTree</a>
<a href="https://www.javatpoint.com/java-jcolorchooser">Java JColorChooser</a>
<a href="https://www.javatpoint.com/java-jtabbedpane">Java JTabbedPane</a>
<a href="https://www.javatpoint.com/java-jslider">Java JSlider</a>
<a href="https://www.javatpoint.com/java-jspinner">Java JSpinner</a>
<a href="https://www.javatpoint.com/java-jdialog">Java JDialog</a>
<a href="https://www.javatpoint.com/java-jpanel">Java JPanel</a>
<a href="https://www.javatpoint.com/java-jfilechooser">Java JFileChooser</a>
<a href="https://www.javatpoint.com/java-jtogglebutton">Java JToggleButton</a>
<a href="https://www.javatpoint.com/java-jtoolbar">Java JToolBar</a>
<a href="https://www.javatpoint.com/java-jviewport">Java JViewport</a>

<a href="https://www.javatpoint.com/java-jframe">Java JFrame</a>
<a href="https://www.javatpoint.com/java-jcomponent">Java JComponent</a>

<a href="https://www.javatpoint.com/java-jlayeredpane">Java JLayeredPane</a>
<a href="https://www.javatpoint.com/java-jdesktoppane">Java JDesktopPane</a>
<a href="https://www.javatpoint.com/java-jeditorpane">Java JEditorPane</a>
<a href="https://www.javatpoint.com/java-jscrollpane">Java JScrollPane</a>
<a href="https://www.javatpoint.com/java-jsplitpane">Java JSplitPane</a>
<a href="https://www.javatpoint.com/java-jtextpane">Java JTextPane</a>
<a href="https://www.javatpoint.com/java-jrootpane" style="color: black;"><strong>Java JRootPane</strong> <img src="./JRootPaneExample_files/open-12.png" alt="open link"></a>

<a href="https://www.javatpoint.com/how-to-use-tooltip-in-java-swing">Using ToolTip</a>
<a href="https://www.javatpoint.com/how-to-change-titlebar-icon-in-java-awt-swing">Change Title Icon</a>
<a href="https://www.javatpoint.com/how-to-make-an-executable-jar-file-in-java">Executable Jar File</a>
<a href="https://www.javatpoint.com/digital-watch" class="l1">Digital Watch</a>
<a href="https://www.javatpoint.com/Graphics-in-swing" class="l1">Graphics in swing</a>
<a href="https://www.javatpoint.com/Displaying-image-in-swing" class="l1">Displaying Image</a>
</div>
<div class="leftmenu2">
<h2 class="spanh2"><span class="spanh2">Java Swing Apps</span></h2>
</div>
<div class="leftmenu">
<a href="https://www.javatpoint.com/notepad" class="l1">Notepad</a>
<a href="https://www.javatpoint.com/calculator-in-java" class="l1">Calculator</a>
<a href="https://www.javatpoint.com/ip-finder-in-java" class="l1">IP Finder</a>
<a href="https://www.javatpoint.com/word-count-in-java" class="l1">Word Counter</a>
<a href="https://www.javatpoint.com/url-source-code-generator-in-java" class="l1">URL Source Generator</a>
<a href="https://www.javatpoint.com/folder-explorer-in-java" class="l1">Folder Explorer</a>
<a href="https://www.javatpoint.com/Puzzle-Game" class="l1">Puzzle Game</a>
<a href="https://www.javatpoint.com/Pic-Puzzle-Game" class="l1">Pic Puzzle Game</a>
<a href="https://www.javatpoint.com/tic-tac-toe-game" class="l1">Tic Tac Toe Game</a>
<a href="https://www.javatpoint.com/online-exam-project-in-java-swing-without-database" class="l1">Online Exam</a>
</div>

<div class="leftmenu2">
<h2 class="spanh2"><span class="spanh2">LayoutManagers</span></h2>
</div>
<div class="leftmenu">
<a href="https://www.javatpoint.com/java-layout-manager">BorderLayout</a>
<a href="https://www.javatpoint.com/GridLayout">GridLayout</a>
<a href="https://www.javatpoint.com/FlowLayout">FlowLayout</a>
<a href="https://www.javatpoint.com/BoxLayout">BoxLayout</a>
<a href="https://www.javatpoint.com/CardLayout">CardLayout</a>
<a href="https://www.javatpoint.com/java-gridbaglayout">GridBagLayout</a>
<a href="https://www.javatpoint.com/java-grouplayout">GroupLayout</a>
<a href="https://www.javatpoint.com/java-springlayout">SpringLayout</a>
<a href="https://www.javatpoint.com/java-scrollpanelayout">ScrollPaneLayout</a>
</div>

<div class="leftmenu2">
<a href="https://www.javatpoint.com/javafx-tutorial"><span>JavaFX</span></a>
<a href="https://www.javatpoint.com/java-applet"><span>Java Applet</span></a>
<a href="https://www.javatpoint.com/java-reflection"><span>Java Reflection</span></a>
<a href="https://www.javatpoint.com/java-date"><span>Java Date</span></a>
<a href="https://www.javatpoint.com/java-string-to-int"><span>Java Conversion</span></a>
<a href="https://www.javatpoint.com/collections-in-java"><span>Java Collection</span></a>
<a href="https://www.javatpoint.com/java-jdbc"><span>Java JDBC</span></a>
<a href="https://www.javatpoint.com/New-features-in-java"><span>Java New Features</span></a>
<a href="https://www.javatpoint.com/RMI"><span>RMI</span></a>
<a href="https://www.javatpoint.com/internationalization-in-java"><span>Internationalization</span></a>
<a href="https://www.javatpoint.com/corejava-interview-questions"><span>Interview Questions</span></a>
</div>

<img src="./JRootPaneExample_files/wh.JPG" alt="JavaTpoint">
<br>
<div id="leftad" style="margin-left:20px">
<!-- javatpointleft -->
<ins class="adPushupAds" data-adpcontrol="g8drp" data-ver="2" data-siteid="37780" data-ac="PHNjcmlwdCBhc3luYyBzcmM9Ii8vcGFnZWFkMi5nb29nbGVzeW5kaWNhdGlvbi5jb20vcGFnZWFkL2pzL2Fkc2J5Z29vZ2xlLmpzIj48L3NjcmlwdD4KPCEtLSBqYXZhdHBvaW50bGVmdCAtLT4KPGlucyBjbGFzcz0iYWRzYnlnb29nbGUiCiAgICAgc3R5bGU9ImRpc3BsYXk6aW5saW5lLWJsb2NrO3dpZHRoOjE2MHB4O2hlaWdodDo2MDBweCIKICAgICBkYXRhLWFkLWNsaWVudD0iY2EtcHViLTQ2OTk4NTg1NDkwMjMzODIiCiAgICAgZGF0YS1hZC1zbG90PSI0NDc2NDAxMjIyIj48L2lucz4KPHNjcmlwdD4KKGFkc2J5Z29vZ2xlID0gd2luZG93LmFkc2J5Z29vZ2xlIHx8IFtdKS5wdXNoKHt9KTsKPC9zY3JpcHQ+" data-push="1"></ins><script data-cfasync="false" type="text/javascript">(function (w, d) { for (var i = 0, j = d.getElementsByTagName("ins"), k = j[i]; i < j.length; k = j[++i]){ if(k.className == "adPushupAds" && k.getAttribute("data-push") != "1") { ((w.adpushup = w.adpushup || {}).control = (w.adpushup.control || [])).push(k); k.setAttribute("data-push", "1");} } })(window, document);</script>

</div>
<div id="8b476cee-75c9-4caf-a662-cd49b79c2ba9" data-section="8b476cee-75c9-4caf-a662-cd49b79c2ba9" class="_ap_apex_ad" data-xpath="#menu" data-section-id="" data-render-time="1608363263401" data-ap-network="adpTags" style="display: block; clear: both; text-align: center; margin: 20px auto; width: 160px; height: 600px; overflow: hidden;" data-refresh-time="1608363319126" data-timeout="921"><div id="ADP_37780_160X600_8b476cee-75c9-4caf-a662-cd49b79c2ba9" style="text-align: center; margin: 0 auto;" data-google-query-id="CMaWtaPE2e0CFRGErAIdeFcLPA">
<script type="text/javascript">
window.adpushup.adpTags.que.push(function(){
window.adpushup.adpTags.display("ADP_37780_160X600_8b476cee-75c9-4caf-a662-cd49b79c2ba9");
});
</script>
<div id="google_ads_iframe_/103512698/21773424079_0__container__" style="border: 0pt none; width: 160px; height: 600px;"></div></div></div><div class="adp_interactive_ad" style="width: 160px; height: 600px;"><div id="75781991-c109-4107-b6cd-bcaebbbb369d" data-section="75781991-c109-4107-b6cd-bcaebbbb369d" class="_ap_apex_ad" data-render-time="1608363263415" style="background: transparent; width: 160px; height: 600px; display: block; text-align: center; position: relative;" data-refresh-time="1608363265416" data-timeout="111"><div id="ADP_37780_160X600_75781991-c109-4107-b6cd-bcaebbbb369d" style="text-align: center; margin: 0 auto;" data-google-query-id="CIGr54jE2e0CFZMh1QodqGANjA">
<script type="text/javascript">
window.adpushup.adpTags.que.push(function(){
window.adpushup.adpTags.display("ADP_37780_160X600_75781991-c109-4107-b6cd-bcaebbbb369d");
});
</script>
<div id="google_ads_iframe_/103512698/21929136915_0__container__" style="border: 0pt none; width: 160px; height: 600px;"></div></div></div></div></div>
<div class="onlycontent" style="height: auto !important;"><div id="560740ef-114b-4b94-8a1b-52dc344b2054" data-section="560740ef-114b-4b94-8a1b-52dc344b2054" class="_ap_apex_ad" data-xpath=".onlycontent:eq(0)" data-section-id="" data-render-time="1608363263406" data-ap-network="adpTags" data-refresh-time="1608363263406" data-timeout="11" style="display: block; clear: both; text-align: center; margin: 10px auto 20px; width: 728px; height: 90px; overflow: hidden;"><div id="ADP_37780_728X90_560740ef-114b-4b94-8a1b-52dc344b2054" style="text-align: center; margin: 0 auto;" data-google-query-id="CPrj6IjE2e0CFZMh1QodqGANjA">

<div id="google_ads_iframe_/103512698/21845298506_0__container__" style="border: 0pt none; display: inline-block; width: 728px; height: 90px;"><iframe frameborder="0" src="./JRootPaneExample_files/container.html" id="google_ads_iframe_/103512698/21845298506_0" title="3rd party ad content" name="" scrolling="no" marginwidth="0" marginheight="0" width="728" height="90" data-is-safeframe="true" sandbox="allow-forms allow-popups allow-popups-to-escape-sandbox allow-same-origin allow-scripts allow-top-navigation-by-user-activation" data-google-container-id="3" style="border: 0px; vertical-align: bottom;" data-load-complete="true"></iframe></div></div></div>
<div class="onlycontentad">
<!-- CM_JTP_Leaderbaord -->
<ins class="adPushupAds" data-adpcontrol="nuoc1" data-ver="2" data-siteid="37780" data-ac="PHNjcmlwdCBhc3luYyBzcmM9Ii8vcGFnZWFkMi5nb29nbGVzeW5kaWNhdGlvbi5jb20vcGFnZWFkL2pzL2Fkc2J5Z29vZ2xlLmpzIj48L3NjcmlwdD4KPCEtLSBDTV9KVFBfTGVhZGVyYmFvcmQgLS0+CjxpbnMgY2xhc3M9ImFkc2J5Z29vZ2xlIgogICAgIHN0eWxlPSJkaXNwbGF5OmJsb2NrIgogICAgIGRhdGEtYWQtY2xpZW50PSJjYS1wdWItNDY5OTg1ODU0OTAyMzM4MiIKICAgICBkYXRhLWFkLXNsb3Q9IjkyMDE5MDE5MTUiCiAgICAgZGF0YS1hZC1mb3JtYXQ9ImF1dG8iCiAgICAgZGF0YS1mdWxsLXdpZHRoLXJlc3BvbnNpdmU9InRydWUiPjwvaW5zPgo8c2NyaXB0PgooYWRzYnlnb29nbGUgPSB3aW5kb3cuYWRzYnlnb29nbGUgfHwgW10pLnB1c2goe30pOwo8L3NjcmlwdD4=" data-push="1"></ins><script data-cfasync="false" type="text/javascript">(function (w, d) { for (var i = 0, j = d.getElementsByTagName("ins"), k = j[i]; i < j.length; k = j[++i]){ if(k.className == "adPushupAds" && k.getAttribute("data-push") != "1") { ((w.adpushup = w.adpushup || {}).control = (w.adpushup.control || [])).push(k); k.setAttribute("data-push", "1");} } })(window, document);</script>
</div>
<div class="onlycontentinner" style="height: auto !important;">
<div id="city">
<table>
<tbody><tr><td>

<div id="bottomnextup">
<a class="next" href="https://www.javatpoint.com/how-to-use-tooltip-in-java-swing">next &#8594;</a>
<a class="next" href="https://www.javatpoint.com/java-jtextpane">&#8592; prev</a>
</div>

<h1 class="h1">Java JRootPane</h1>
<p>JRootPane is a lightweight container used behind the scenes by JFrame, JDialog, JWindow, JApplet, and JInternalFrame.</p>
<h3 class="h3">Nested Classes</h3>
<table class="alt">
    <tbody><tr>
        <th>Modifier and Type</th>
        <th>Class</th>
        <th>Description</th>
    </tr>
    <tr>
        <td>protected class</td>
        <td>JRootPane.AccessibleJRootPane</td>
        <td>This class implements accessibility support for the JRootPane class.</td>
    </tr>
    <tr>
        <td>protected class</td>
        <td>JRootPane.RootLayout</td>
        <td>A custom layout manager that is responsible for the layout of layeredPane, glassPane, and menuBar.</td>
    </tr>
</tbody></table>
<h3 class="h3">Fields</h3>
<table class="alt">
    <tbody><tr>
        <th>Modifier and Type</th>
        <th>Field</th>
        <th>Description</th>
    </tr>
    <tr>
        <td>static int</td>
        <td>COLOR_CHOOSER_DIALOG</td>
        <td>Constant used for the windowDecorationStyle property.</td>
    </tr>
    <tr>
        <td>protected JButton</td>
        <td>contentPane</td>
        <td>The content pane.</td>
    </tr>
    <tr>
        <td>protected Container</td>
        <td>defaultButton</td>
        <td>The button that gets activated when the pane has the focus and a UI-specific action like pressing the Enter key occurs.</td>
    </tr>
    <tr>
        <td>protected JMenuBar</td>
        <td>menuBar</td>
        <td>The menu bar.</td>
    </tr>
    <tr>
        <td>protected Component</td>
        <td>glassPane</td>
        <td>The glass pane that overlays the menu bar and content pane, so it can intercept mouse movements and such.</td>
    </tr>
    <tr>
        <td>static int</td>
        <td>ERROR_DIALOG</td>
        <td>Constant used for the windowDecorationStyle property.</td>
    </tr>
</tbody></table>
<h3 class="h3">Constructor</h3>
<table class="alt">
    <tbody><tr>
        <th>Constructor</th>
        <th>Description</th>
    </tr>
    <tr>
        <td>JRootPane()</td>
        <td>Creates a JRootPane, setting up its glassPane, layeredPane, and contentPane.</td>
    </tr>
</tbody></table>
<h3 class="h3">Useful Methods</h3>
<table class="alt">
    <tbody><tr>
        <th>Modifier and Type</th>
        <th>Method</th>
        <th>Description</th>
    </tr>
    <tr>
        <td>protected void</td>
        <td>addImpl(Component comp, Object constraints, int index)</td>
        <td>Overridden to enforce the position of the glass component as the zero child.</td>
    </tr>
    <tr>
        <td>void</td>
        <td>addNotify()</td>
        <td>Notifies this component that it now has a parent component.</td>
    </tr>
    <tr>
        <td>protected Container</td>
        <td>createContentPane()</td>
        <td>It is called by the constructor methods to create the default contentPane.</td>
    </tr>
    <tr>
        <td>protected Component</td>
        <td>createGlassPane()</td>
        <td>It called by the constructor methods to create the default glassPane.</td>
    </tr>
    <tr>
        <td>AccessibleContext</td>
        <td>getAccessibleContext()</td>
        <td>It gets the AccessibleContext associated with this JRootPane.</td>
    </tr>
    <tr>
        <td>JButton</td>
        <td>getDefaultButton()</td>
        <td>It returns the value of the defaultButton property.</td>
    </tr>
    <tr>
        <td>void</td>
        <td>setContentPane(Container content)</td>
        <td>It sets the content pane -- the container that holds the components parented by the root pane.</td>
    </tr>
    <tr>
        <td>void</td>
        <td>setDefaultButton(JButton defaultButton)</td>
        <td>It sets the defaultButton property, which determines the current default button for this JRootPane.</td>
    </tr>
    <tr>
        <td>void</td>
        <td>setJMenuBar(JMenuBar menu)</td>
        <td>It adds or changes the menu bar used in the layered pane.</td>
    </tr>
</tbody></table>
<hr>
<h2 class="h2">JRootPane Example</h2>
<div class="codeblock"><div class="dp-highlighter"><div class="bar"><div class="tools"><a href="https://www.javatpoint.com/java-jrootpane#" onclick="dp.sh.Toolbar.Command(&#39;ViewSource&#39;,this);return false;"></a><a href="https://www.javatpoint.com/java-jrootpane#" onclick="dp.sh.Toolbar.Command(&#39;PrintSource&#39;,this);return false;"></a><a href="https://www.javatpoint.com/java-jrootpane#" onclick="dp.sh.Toolbar.Command(&#39;About&#39;,this);return false;"></a></div></div><ol start="1" class="dp-j"><li class="alt"><span><span class="keyword">import</span><span>&nbsp;javax.swing.JButton;&nbsp;&nbsp;</span></span></li><li class=""><span><span class="keyword">import</span><span>&nbsp;javax.swing.JFrame;&nbsp;&nbsp;</span></span></li><li class="alt"><span><span class="keyword">import</span><span>&nbsp;javax.swing.JMenu;&nbsp;&nbsp;</span></span></li><li class=""><span><span class="keyword">import</span><span>&nbsp;javax.swing.JMenuBar;&nbsp;&nbsp;</span></span></li><li class="alt"><span><span class="keyword">import</span><span>&nbsp;javax.swing.JRootPane;&nbsp;&nbsp;</span></span></li><li class=""><span>&nbsp;&nbsp;</span></li><li class="alt"><span><span class="keyword">public</span><span>&nbsp;</span><span class="keyword">class</span><span>&nbsp;JRootPaneExample&nbsp;{&nbsp;&nbsp;</span></span></li><li class=""><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword">public</span><span>&nbsp;</span><span class="keyword">static</span><span>&nbsp;</span><span class="keyword">void</span><span>&nbsp;main(String[]&nbsp;args)&nbsp;{&nbsp;&nbsp;</span></span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;JFrame&nbsp;f&nbsp;=&nbsp;<span class="keyword">new</span><span>&nbsp;JFrame();&nbsp;&nbsp;</span></span></li><li class=""><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);&nbsp;&nbsp;</span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;JRootPane&nbsp;root&nbsp;=&nbsp;f.getRootPane();&nbsp;&nbsp;</span></li><li class=""><span>&nbsp;&nbsp;</span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="comment">//&nbsp;Create&nbsp;a&nbsp;menu&nbsp;bar</span><span>&nbsp;&nbsp;</span></span></li><li class=""><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;JMenuBar&nbsp;bar&nbsp;=&nbsp;<span class="keyword">new</span><span>&nbsp;JMenuBar();&nbsp;&nbsp;</span></span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;JMenu&nbsp;menu&nbsp;=&nbsp;<span class="keyword">new</span><span>&nbsp;JMenu(</span><span class="string">"File"</span><span>);&nbsp;&nbsp;</span></span></li><li class=""><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;bar.add(menu);&nbsp;&nbsp;</span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;menu.add(<span class="string">"Open"</span><span>);&nbsp;&nbsp;</span></span></li><li class=""><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;menu.add(<span class="string">"Close"</span><span>);&nbsp;&nbsp;</span></span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;root.setJMenuBar(bar);&nbsp;&nbsp;</span></li><li class=""><span>&nbsp;&nbsp;</span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="comment">//&nbsp;Add&nbsp;a&nbsp;button&nbsp;to&nbsp;the&nbsp;content&nbsp;pane</span><span>&nbsp;&nbsp;</span></span></li><li class=""><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;root.getContentPane().add(<span class="keyword">new</span><span>&nbsp;JButton(</span><span class="string">"Press&nbsp;Me"</span><span>));&nbsp;&nbsp;</span></span></li><li class="alt"><span>&nbsp;&nbsp;</span></li><li class=""><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="comment">//&nbsp;Display&nbsp;the&nbsp;UI</span><span>&nbsp;&nbsp;</span></span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;f.pack();&nbsp;&nbsp;</span></li><li class=""><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;f.setVisible(<span class="keyword">true</span><span>);&nbsp;&nbsp;</span></span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;</span></li><li class=""><span>}&nbsp;&nbsp;</span></li></ol></div><textarea name="code" class="java" style="display: none;">import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JRootPane;

public class JRootPaneExample {
	 public static void main(String[] args) {
		    JFrame f = new JFrame();
		    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    JRootPane root = f.getRootPane();

		    // Create a menu bar
		    JMenuBar bar = new JMenuBar();
		    JMenu menu = new JMenu("File");
		    bar.add(menu);
		    menu.add("Open");
		    menu.add("Close");
		    root.setJMenuBar(bar);

		    // Add a button to the content pane
		    root.getContentPane().add(new JButton("Press Me"));

		    // Display the UI
		    f.pack();
		    f.setVisible(true);
		  }
}
</textarea></div>
<p>Output</p>
<img src="./JRootPaneExample_files/java-jrootpane.png" alt="Java JRootpane ">
<br>
<div class="nexttopicdiv">
<span class="nexttopictext">Next Topic</span><span class="nexttopiclink"><a href="https://www.javatpoint.com/how-to-use-tooltip-in-java-swing">How to use tooltip in Java Swing</a></span>
</div>
<!-- link -->
<br><br>

<div id="bottomnext">
<a style="float:left" class="next" href="https://www.javatpoint.com/java-jtextpane">&#8592; prev</a>
<a style="float:right" class="next" href="https://www.javatpoint.com/how-to-use-tooltip-in-java-swing">next &#8594;</a>
</div>

<br><br>
</td></tr></tbody></table>
</div>
 

               <div><img class=" lazyloaded" data-src="https://static.javatpoint.com/images/youtube-32.png" style="vertical-align:middle;" alt="Youtube" src="./JRootPaneExample_files/youtube-32.png">
               <span class="h3" style="vertical-align:middle;font-size:22px"> For Videos Join Our Youtube Channel: <a href="https://bit.ly/2FOeX6S" target="_blank"> Join Now</a></span>
               </div>
               <hr> 

 

<h2 class="h2">Help Others, Please Share</h2>
<a rel="nofollow" title="Facebook" target="_blank" href="https://www.facebook.com/sharer.php?u=https://www.javatpoint.com/java-jrootpane"><img src="./JRootPaneExample_files/facebook32.png" alt="facebook"></a>
<a rel="nofollow" title="Twitter" target="_blank" href="https://twitter.com/share?url=https://www.javatpoint.com/java-jrootpane"><img src="./JRootPaneExample_files/twitter32.png" alt="twitter"></a>
<a rel="nofollow" title="Pinterest" target="_blank" href="https://www.pinterest.com/pin/create/button/?url=https://www.javatpoint.com/java-jrootpane"><img src="./JRootPaneExample_files/pinterest32.png" alt="pinterest"></a>
<!-- contribute start-->

<!-- contribute end-->

<script async="" src="./JRootPaneExample_files/f(9).txt"></script>
<!-- AP_37780_300x250(0) -->
<ins class="adsbygoogle" style="display: block; height: 280px;" data-ad-client="ca-pub-4699858549023382" data-ad-slot="5022809933" data-ad-format="auto" data-full-width-responsive="true" data-adsbygoogle-status="done"><ins id="aswift_0_expand" style="display:inline-table;border:none;height:280px;margin:0;padding:0;position:relative;visibility:visible;width:987px;background-color:transparent;" tabindex="0" title="Advertisement" aria-label="Advertisement"><ins id="aswift_0_anchor" style="display: block; border: none; height: 280px; margin: 0px; padding: 0px; position: relative; visibility: visible; width: 987px; background-color: transparent; overflow: visible;"><iframe id="aswift_0" name="aswift_0" style="left:0;position:absolute;top:0;border:0;width:987px;height:280px;" sandbox="allow-forms allow-popups allow-popups-to-escape-sandbox allow-same-origin allow-scripts allow-top-navigation-by-user-activation" width="987" height="280" frameborder="0" src="./JRootPaneExample_files/ads.html" marginwidth="0" marginheight="0" vspace="0" hspace="0" allowtransparency="true" scrolling="no" allowfullscreen="true" data-google-container-id="a!1" data-google-query-id="CIDx_IfE2e0CFRLFjwodUtEFNA" data-load-complete="true"></iframe></ins></ins></ins>
<script>
     (adsbygoogle = window.adsbygoogle || []).push({});
</script>



<!-- latest tutorials start --> 
<h2 class="h2">Learn Latest Tutorials</h2>
<div class="firsthomecontent">

                          <a href="https://www.javatpoint.com/apache-solr">
                            <div class="homecontent"><img class=" lazyloaded" data-src="https://static.javatpoint.com/tutorial/apache-solr/images/apache-solr-home.png" alt="Apache Solr Tutorial" src="./JRootPaneExample_files/apache-solr-home.png">
                                <p>Solr</p> 
                            </div>    
                        </a>  
                        <a href="https://www.javatpoint.com/mongodb-tutorial">
                            <div class="homecontent"><img class=" lazyloaded" data-src="https://static.javatpoint.com/images/logo/mongodb.png" alt="MongoDB tutorial" src="./JRootPaneExample_files/mongodb.png">
                                <p>MongoDB</p>
                            </div>
                        </a>
                          <a href="https://www.javatpoint.com/gimp">
                            <div class="homecontent"><img class=" lazyloaded" data-src="https://static.javatpoint.com/tutorial/gimp/images/gimp-home.png" alt="Gimp Tutorial" src="./JRootPaneExample_files/gimp-home.png">
                                <p>Gimp</p> 
                            </div>    
                        </a>  
                          <a href="https://www.javatpoint.com/verilog">
                            <div class="homecontent"><img class=" lazyloaded" data-src="https://static.javatpoint.com/tutorial/verilog/images/verilog-home.png" alt="Verilog Tutorial" src="./JRootPaneExample_files/verilog-home.png">
                                <p>Verilog</p> 
                            </div>    
                        </a>  
                          <a href="https://www.javatpoint.com/teradata">
                            <div class="homecontent"><img class=" lazyloaded" data-src="https://static.javatpoint.com/tutorial/teradata/images/teradata-home.png" alt="Teradata Tutorial" src="./JRootPaneExample_files/teradata-home.png">
                                <p>Teradata</p> 
                            </div>    
                        </a>  

                          <a href="https://www.javatpoint.com/phonegap">
                            <div class="homecontent"><img class=" lazyloaded" data-src="https://static.javatpoint.com/tutorial/phonegap/images/phonegap-home.png" alt="PhoneGap Tutorial" src="./JRootPaneExample_files/phonegap-home.png">
                                <p>PhoneGap</p> 
                            </div>    
                        </a>  
                          <a href="https://www.javatpoint.com/gmail">
                            <div class="homecontent"><img class=" lazyloaded" data-src="https://static.javatpoint.com/tutorial/gmail/images/gmail-home.png" alt="Gmail Tutorial" src="./JRootPaneExample_files/gmail-home.png">
                                <p>Gmail</p> 
                            </div>    
                        </a>  
                          <a href="https://www.javatpoint.com/vue-js">
                            <div class="homecontent"><img class=" lazyloaded" data-src="https://static.javatpoint.com/tutorial/vue-js/images/vue-js-home.png" alt="Vue.js Tutorial" src="./JRootPaneExample_files/vue-js-home.png">
                                <p>Vue.js</p> 
                            </div>    
                        </a>  

                        <a href="https://www.javatpoint.com/plc">
                            <div class="homecontent"><img class=" lazyloaded" data-src="https://static.javatpoint.com/tutorial/plc/images/plc-home.jpg" alt="PLC tutorial" src="./JRootPaneExample_files/plc-home.jpg">
                                <p>PLC</p>
                            </div>
                        </a>
                          <a href="https://www.javatpoint.com/adobe-illustrator">
                            <div class="homecontent"><img class=" lazyloaded" data-src="https://static.javatpoint.com/tutorial/adobe-illustrator/images/adobe-illustrator-home.png" alt="Adobe Illustrator Tutorial" src="./JRootPaneExample_files/adobe-illustrator-home.png">
                                <p>Illustrator</p> 
                            </div>    
                        </a>  
                          <a href="https://www.javatpoint.com/postman">
                            <div class="homecontent"><img class=" lazyloaded" data-src="https://static.javatpoint.com/tutorial/postman/images/postman-home.png" alt="Postman Tutorial" src="./JRootPaneExample_files/postman-home.png">
                                <p>Postman</p> 
                            </div>    
                        </a>  

</div>
<hr>
<!-- preparation start -->  
<h2 class="h2">Preparation</h2>
<div class="firsthomecontent"> 
 
                        <a href="https://www.javatpoint.com/aptitude/quantitative">
                            <div class="homecontent"><img class=" lazyloaded" data-src="https://static.javatpoint.com/aptitude/images/quantitative-aptitude-home.png" alt="Aptitude" src="./JRootPaneExample_files/quantitative-aptitude-home.png">
                                <p>Aptitude</p>
                            </div>
                        </a>
                        <a href="https://www.javatpoint.com/reasoning">
                            <div class="homecontent"><img class=" lazyloaded" data-src="https://static.javatpoint.com/reasoning/images/reasoning-home.png" alt="Logical Reasoning" src="./JRootPaneExample_files/reasoning-home.png">
                                <p>Reasoning</p>
                            </div>
                        </a>
                        <a href="https://www.javatpoint.com/verbal-ability">
                            <div class="homecontent"><img class=" lazyloaded" data-src="https://static.javatpoint.com/verbal-ability/images/verbal-ability-home.png" alt="Verbal Ability" src="./JRootPaneExample_files/verbal-ability-home.png">
                                <p>Verbal A.</p>
                            </div>
                        </a>
                        <a href="https://www.javatpoint.com/interview-questions-and-answers">
                            <div class="homecontent"><img class=" lazyloaded" data-src="https://static.javatpoint.com/images/logo/interviewhome.png" alt="Interview Questions" src="./JRootPaneExample_files/interviewhome.png">
                                <p>Interview</p>
                            </div>
                        </a>
                        <a href="https://www.javatpoint.com/company-interview-questions-and-recruitment-process">
                            <div class="homecontent"><img class=" lazyloaded" data-src="https://static.javatpoint.com/interview/images/company-home.jpeg" alt="Company Interview Questions" src="./JRootPaneExample_files/company-home.jpeg">
                                <p>Company</p>
                            </div> 
                        </a> 

</div>
<hr>
<!-- trending start -->  
<h2 class="h2">Trending Technologies</h2>
<div class="firsthomecontent">

                        <a href="https://www.javatpoint.com/artificial-intelligence-tutorial">
                            <div class="homecontent"><img class=" lazyloaded" data-src="https://static.javatpoint.com/tutorial/ai/images/ai-home.png" alt="Artificial Intelligence Tutorial" src="./JRootPaneExample_files/ai-home.png">
                                <p>AI</p>
                            </div> 
                        </a> 
                        <a href="https://www.javatpoint.com/aws-tutorial">
                            <div class="homecontent"><img class=" lazyloaded" data-src="https://static.javatpoint.com/tutorial/aws/images/aws-home.png" alt="AWS Tutorial" src="./JRootPaneExample_files/aws-home.png">
                                <p>AWS</p>
                            </div>
                        </a>
                        <a href="https://www.javatpoint.com/selenium-tutorial">
                            <div class="homecontent"><img class=" lazyloaded" data-src="https://static.javatpoint.com/tutorial/selenium/images/selenium-home.jpg" alt="Selenium tutorial" src="./JRootPaneExample_files/selenium-home.jpg">
                                <p>Selenium</p>
                            </div>
                        </a>
                        <a href="https://www.javatpoint.com/cloud-computing-tutorial">
                            <div class="homecontent"><img class=" lazyloaded" data-src="https://static.javatpoint.com/images/logo/cloudhome.png" alt="Cloud tutorial" src="./JRootPaneExample_files/cloudhome.png">
                                <p>Cloud</p>
                            </div>
                        </a>
                        <a href="https://www.javatpoint.com/hadoop-tutorial">
                            <div class="homecontent"><img class=" lazyloaded" data-src="https://static.javatpoint.com/images/logo/hadoop.jpg" alt="Hadoop tutorial" src="./JRootPaneExample_files/hadoop.jpg">
                                <p>Hadoop</p>
                            </div>
                        </a>
                        <a href="https://www.javatpoint.com/reactjs-tutorial">
                            <div class="homecontent"><img class=" lazyloaded" data-src="https://static.javatpoint.com/tutorial/reactjs/images/reactjs-home.png" alt="ReactJS Tutorial" src="./JRootPaneExample_files/reactjs-home.png">
                                <p>ReactJS</p>
                            </div> 
                        </a>  
                        <a href="https://www.javatpoint.com/data-science">
                            <div class="homecontent"><img class=" lazyloaded" data-src="https://static.javatpoint.com/tutorial/data-science/images/data-science-home.png" alt="Data Science Tutorial" src="./JRootPaneExample_files/data-science-home.png">
                                <p>D. Science</p>
                            </div> 
                        </a>  
                        <a href="https://www.javatpoint.com/angular-7-tutorial">
                            <div class="homecontent"><img class=" lazyloaded" data-src="https://static.javatpoint.com/tutorial/angular7/images/angular-7-home.png" alt="Angular 7 Tutorial" src="./JRootPaneExample_files/angular-7-home.png">
                                <p>Angular 7</p>
                            </div> 
                        </a>  
                        <a href="https://www.javatpoint.com/blockchain-tutorial">
                            <div class="homecontent"><img class=" lazyloaded" data-src="https://static.javatpoint.com/tutorial/blockchain/images/blockchain-home.png" alt="Blockchain Tutorial" src="./JRootPaneExample_files/blockchain-home.png">
                                <p>Blockchain</p>
                            </div>  
                        </a> 
                        <a href="https://www.javatpoint.com/git">
                            <div class="homecontent"><img class=" lazyloaded" data-src="https://static.javatpoint.com/tutorial/git/images/git-home.png" alt="Git Tutorial" src="./JRootPaneExample_files/git-home.png">
                                <p>Git</p>
                            </div> 
                        </a> 
                          <a href="https://www.javatpoint.com/machine-learning">
                            <div class="homecontent"><img class=" lazyloaded" data-src="https://static.javatpoint.com/tutorial/machine-learning/images/machine-learning-home.png" alt="Machine Learning Tutorial" src="./JRootPaneExample_files/machine-learning-home.png">
                                <p>ML</p> 
                            </div>    
                        </a> 
                          <a href="https://www.javatpoint.com/devops">
                            <div class="homecontent"><img class=" lazyloaded" data-src="https://static.javatpoint.com/tutorial/devops/images/devops-home.png" alt="DevOps Tutorial" src="./JRootPaneExample_files/devops-home.png">
                                <p>DevOps</p> 
                            </div>    
                        </a> 

</div>
 
<hr>
<!-- B.Tech / MCA -->
                    <h2 class="h2">B.Tech / MCA</h2>
                    <div class="firsthomecontent">
                        <a href="https://www.javatpoint.com/dbms-tutorial">
                            <div class="homecontent"><img class="lazyload" data-src="https://static.javatpoint.com/dbms/images/dbms-home.jpg" alt="DBMS tutorial">
                                <p>DBMS</p>
                            </div>
                        </a>
                        <a href="https://www.javatpoint.com/data-structure-tutorial">
                            <div class="homecontent"><img class="lazyload" data-src="https://static.javatpoint.com/ds/images/ds-home.png" alt="Data Structures tutorial">
                                <p>DS</p>
                            </div>
                        </a> 
                        <a href="https://www.javatpoint.com/daa-tutorial">
                            <div class="homecontent"><img class="lazyload" data-src="https://static.javatpoint.com/tutorial/daa/images/daa-home.png" alt="DAA tutorial">
                                <p>DAA</p>
                            </div>
                        </a>
                        <a href="https://www.javatpoint.com/os-tutorial">
                            <div class="homecontent"><img class="lazyload" data-src="https://static.javatpoint.com/operating-system/images/operating-system-home.png" alt="Operating System tutorial">
                                <p>OS</p>
                            </div>
                        </a>
                        <a href="https://www.javatpoint.com/computer-network-tutorial">
                            <div class="homecontent"><img class="lazyload" data-src="https://static.javatpoint.com/tutorial/computer-network/images/computer-network-home.png" alt="Computer Network tutorial">
                                <p>C. Network</p>
                            </div>
                        </a>
                        <a href="https://www.javatpoint.com/compiler-tutorial">
                            <div class="homecontent"><img class="lazyload" data-src="https://static.javatpoint.com/compiler/images/compiler-design-home.png" alt="Compiler Design tutorial">
                                <p>Compiler D.</p>
                            </div>
                        </a>
                        <a href="https://www.javatpoint.com/computer-organization-and-architecture-tutorial">
                            <div class="homecontent"><img class="lazyload" data-src="https://static.javatpoint.com/tutorial/coa/images/coa-home.png" alt="Computer Organization and Architecture">
                                <p>COA</p>
                            </div>
                        </a>
                        <a href="https://www.javatpoint.com/discrete-mathematics-tutorial">
                            <div class="homecontent"><img class="lazyload" data-src="https://static.javatpoint.com/tutorial/dms/images/discrete-mathematics-home.png" alt="Discrete Mathematics Tutorial">
                                <p>D. Math.</p>
                            </div>
                        </a>
                        <a href="https://www.javatpoint.com/ethical-hacking-tutorial">
                            <div class="homecontent"><img class="lazyload" data-src="https://static.javatpoint.com/tutorial/ethical-hacking/images/ethical-hacking-home.png" alt="Ethical Hacking Tutorial">
                                <p>E. Hacking</p>
                            </div>
                        </a>
                        <a href="https://www.javatpoint.com/computer-graphics-tutorial">
                            <div class="homecontent"><img class="lazyload" data-src="https://static.javatpoint.com/tutorial/computer-graphics/images/computer-graphics-home.png" alt="Computer Graphics Tutorial">
                                <p>C. Graphics</p>
                            </div> 
                        </a>
                        <a href="https://www.javatpoint.com/software-engineering-tutorial">
                            <div class="homecontent"><img class="lazyload" data-src="https://static.javatpoint.com/tutorial/software-engineering/images/software-engineering-home.png" alt="Software Engineering Tutorial">
                                <p>Software E.</p>
                            </div> 
                        </a> 

                        <a href="https://www.javatpoint.com/html-tutorial">
                            <div class="homecontent"><img class="lazyload" data-src="https://static.javatpoint.com/images/logo/html-tutorial.png" alt="html tutorial">
                                <p>Web Tech.</p>
                            </div>
                        </a>
                        <a href="https://www.javatpoint.com/cyber-security-tutorial">
                            <div class="homecontent"><img class="lazyload" data-src="https://static.javatpoint.com/tutorial/cybersecurity/images/cyber-security-home.png" alt="Cyber Security tutorial">
                                <p>Cyber Sec.</p>
                            </div>
                        </a>
                        <a href="https://www.javatpoint.com/automata-tutorial">
                            <div class="homecontent"><img class="lazyload" data-src="https://static.javatpoint.com/tutorial/automata/images/automata-home.jpg" alt="Automata Tutorial">
                                <p>Automata</p>
                            </div> 
                        </a>
                        
                        <a href="https://www.javatpoint.com/c-programming-language-tutorial">
                            <div class="homecontent"><img class="lazyload" data-src="https://static.javatpoint.com/images/logo/clanguagehome.png" alt="C Language tutorial">
                                <p>C</p>
                            </div>
                        </a>
                        <a href="https://www.javatpoint.com/cpp-tutorial">
                            <div class="homecontent"><img class="lazyload" data-src="https://static.javatpoint.com/cpp/images/cpp-home.png" alt="C++ tutorial">
                                <p>C++</p>
                            </div>
                        </a>
                        <a href="https://www.javatpoint.com/java-tutorial">
                            <div class="homecontent"><img class="lazyload" data-src="https://static.javatpoint.com/images/logo/javahome.png" alt="Java tutorial">
                                <p>Java</p>
                            </div>
                        </a>
                        <a href="https://www.javatpoint.com/net-framework">
                            <div class="homecontent"><img class="lazyload" data-src="https://static.javatpoint.com/csharp/net/images/net-home.png" alt=".Net Framework tutorial">
                                <p>.Net</p>
                            </div>
                        </a>
                        <a href="https://www.javatpoint.com/python-tutorial">
                            <div class="homecontent"><img class="lazyload" data-src="https://static.javatpoint.com/images/logo/pythonhome.png" alt="Python tutorial">
                                <p>Python</p>
                            </div>
                        </a>

                        <a href="https://www.javatpoint.com/programs-list">
                            <div class="homecontent"><img class="lazyload" data-src="https://www.javatpoint.com/images/programs.jpg" alt="List of Programs">
                                <p>Programs</p>
                            </div>
                        </a>
                        <a href="https://www.javatpoint.com/control-system-tutorial">
                            <div class="homecontent"><img class="lazyload" data-src="https://static.javatpoint.com/tutorial/control-system/images/control-system-home.jpg" alt="Control Systems tutorial">
                                <p>Control S.</p>
                            </div>
                        </a>
                        <a href="https://www.javatpoint.com/data-mining">
                            <div class="homecontent"><img class="lazyload" data-src="https://static.javatpoint.com/tutorial/data-mining/images/data-mining-home.png" alt="Data Mining Tutorial">
                                <p>Data Mining</p> 
                            </div>    
                        </a> 

</div>

 
</div>


<br><br><div class="mobilemenu" style="clear:both">
<ins class="adPushupAds" data-adpcontrol="jrfe7" data-ver="2" data-siteid="37780" data-ac="PHNjcmlwdCBhc3luYyBzcmM9Ii8vcGFnZWFkMi5nb29nbGVzeW5kaWNhdGlvbi5jb20vcGFnZWFkL2pzL2Fkc2J5Z29vZ2xlLmpzIj48L3NjcmlwdD4KPCEtLSByZXNwb25zaXZlbW9iaWxlZm9vdGVyIC0tPgo8aW5zIGNsYXNzPSJhZHNieWdvb2dsZSIKICAgICBzdHlsZT0iZGlzcGxheTpibG9jayIKICAgICBkYXRhLWFkLWNsaWVudD0iY2EtcHViLTQ2OTk4NTg1NDkwMjMzODIiCiAgICAgZGF0YS1hZC1zbG90PSI4MjIyODY2MzE4IgogICAgIGRhdGEtYWQtZm9ybWF0PSJhdXRvIgogICAgIGRhdGEtZnVsbC13aWR0aC1yZXNwb25zaXZlPSJ0cnVlIj48L2lucz4KPHNjcmlwdD4KKGFkc2J5Z29vZ2xlID0gd2luZG93LmFkc2J5Z29vZ2xlIHx8IFtdKS5wdXNoKHt9KTsKPC9zY3JpcHQ+" data-push="1"></ins><script data-cfasync="false" type="text/javascript">(function (w, d) { for (var i = 0, j = d.getElementsByTagName("ins"), k = j[i]; i < j.length; k = j[++i]){ if(k.className == "adPushupAds" && k.getAttribute("data-push") != "1") { ((w.adpushup = w.adpushup || {}).control = (w.adpushup.control || [])).push(k); k.setAttribute("data-push", "1");} } })(window, document);</script>
</div></div>

<div id="right"><div id="0aae5cbf-3eb2-41c5-bb96-9f93e1a988ea" data-section="0aae5cbf-3eb2-41c5-bb96-9f93e1a988ea" class="_ap_apex_ad" data-xpath="#right" data-section-id="" data-render-time="1608363263392" data-ap-network="adpTags" data-refresh-time="1608363263393" data-timeout="9" style="display: block; clear: both; text-align: center; margin: 20px auto; width: 160px; height: 600px; overflow: hidden;"><div id="ADP_37780_160X600_0aae5cbf-3eb2-41c5-bb96-9f93e1a988ea" style="text-align: center; margin: 0 auto;" data-google-query-id="CP2q54jE2e0CFZMh1QodqGANjA">
<script type="text/javascript">
window.adpushup.adpTags.que.push(function(){
window.adpushup.adpTags.display("ADP_37780_160X600_0aae5cbf-3eb2-41c5-bb96-9f93e1a988ea");
});
</script>
<div id="google_ads_iframe_/103512698/21773771289_0__container__" style="border: 0pt none; width: 160px; height: 600px;"></div></div></div>

<ins class="adPushupAds" data-adpcontrol="am3c1" data-ver="2" data-siteid="37780" data-ac="PHNjcmlwdCBhc3luYyBzcmM9Ii8vcGFnZWFkMi5nb29nbGVzeW5kaWNhdGlvbi5jb20vcGFnZWFkL2pzL2Fkc2J5Z29vZ2xlLmpzIj48L3NjcmlwdD4KPCEtLSBuZXdyaWdodCAtLT4KPGlucyBjbGFzcz0iYWRzYnlnb29nbGUiCiAgICAgc3R5bGU9ImRpc3BsYXk6YmxvY2siCiAgICAgZGF0YS1hZC1jbGllbnQ9ImNhLXB1Yi00Njk5ODU4NTQ5MDIzMzgyIgogICAgIGRhdGEtYWQtc2xvdD0iNjAzNDkxMjU0MSIKICAgICBkYXRhLWFkLWZvcm1hdD0iYXV0byIKICAgICBkYXRhLWZ1bGwtd2lkdGgtcmVzcG9uc2l2ZT0idHJ1ZSI+PC9pbnM+CjxzY3JpcHQ+CihhZHNieWdvb2dsZSA9IHdpbmRvdy5hZHNieWdvb2dsZSB8fCBbXSkucHVzaCh7fSk7Cjwvc2NyaXB0Pg==" data-push="1"></ins><script data-cfasync="false" type="text/javascript">(function (w, d) { for (var i = 0, j = d.getElementsByTagName("ins"), k = j[i]; i < j.length; k = j[++i]){ if(k.className == "adPushupAds" && k.getAttribute("data-push") != "1") { ((w.adpushup = w.adpushup || {}).control = (w.adpushup.control || [])).push(k); k.setAttribute("data-push", "1");} } })(window, document);</script>

<br><br>

<ins class="adPushupAds" data-adpcontrol="am3c1" data-ver="2" data-siteid="37780" data-ac="PHNjcmlwdCBhc3luYyBzcmM9Ii8vcGFnZWFkMi5nb29nbGVzeW5kaWNhdGlvbi5jb20vcGFnZWFkL2pzL2Fkc2J5Z29vZ2xlLmpzIj48L3NjcmlwdD4KPCEtLSBuZXdyaWdodCAtLT4KPGlucyBjbGFzcz0iYWRzYnlnb29nbGUiCiAgICAgc3R5bGU9ImRpc3BsYXk6YmxvY2siCiAgICAgZGF0YS1hZC1jbGllbnQ9ImNhLXB1Yi00Njk5ODU4NTQ5MDIzMzgyIgogICAgIGRhdGEtYWQtc2xvdD0iNjAzNDkxMjU0MSIKICAgICBkYXRhLWFkLWZvcm1hdD0iYXV0byIKICAgICBkYXRhLWZ1bGwtd2lkdGgtcmVzcG9uc2l2ZT0idHJ1ZSI+PC9pbnM+CjxzY3JpcHQ+CihhZHNieWdvb2dsZSA9IHdpbmRvdy5hZHNieWdvb2dsZSB8fCBbXSkucHVzaCh7fSk7Cjwvc2NyaXB0Pg==" data-push="1"></ins><script data-cfasync="false" type="text/javascript">(function (w, d) { for (var i = 0, j = d.getElementsByTagName("ins"), k = j[i]; i < j.length; k = j[++i]){ if(k.className == "adPushupAds" && k.getAttribute("data-push") != "1") { ((w.adpushup = w.adpushup || {}).control = (w.adpushup.control || [])).push(k); k.setAttribute("data-push", "1");} } })(window, document);</script>

<br><br>
<div class="adp_interactive_ad" style="width: 160px; height: 600px;"><div id="d5033661-6655-44cb-9aa6-b36d9fa0c69a" data-section="d5033661-6655-44cb-9aa6-b36d9fa0c69a" class="_ap_apex_ad" data-render-time="1608363263414" style="background: transparent; width: 160px; height: 600px; display: block; text-align: center; position: fixed; inset: 0px auto auto; z-index: 10000; margin: 0px;" data-refresh-time="1608363319129" data-timeout="923"><div id="ADP_37780_160X600_d5033661-6655-44cb-9aa6-b36d9fa0c69a" style="text-align: center; margin: 0 auto;" data-google-query-id="CMeWtaPE2e0CFRGErAIdeFcLPA">
<script type="text/javascript">
window.adpushup.adpTags.que.push(function(){
window.adpushup.adpTags.display("ADP_37780_160X600_d5033661-6655-44cb-9aa6-b36d9fa0c69a");
});
</script>
<div id="google_ads_iframe_/103512698/21865468809_0__container__" style="border: 0pt none; width: 160px; height: 600px;"></div></div></div></div></div>

<div class="right1024" style="float:left;margin-left:10px;margin-top:120px;">
<!-- right1024only -->
<ins class="adPushupAds" data-adpcontrol="6d5qg" data-ver="2" data-siteid="37780" data-ac="PHNjcmlwdCBhc3luYyBzcmM9Ii8vcGFnZWFkMi5nb29nbGVzeW5kaWNhdGlvbi5jb20vcGFnZWFkL2pzL2Fkc2J5Z29vZ2xlLmpzIj48L3NjcmlwdD4KPCEtLSByaWdodDEwMjRvbmx5IC0tPgo8aW5zIGNsYXNzPSJhZHNieWdvb2dsZSIKICAgICBzdHlsZT0iZGlzcGxheTppbmxpbmUtYmxvY2s7d2lkdGg6MTIwcHg7aGVpZ2h0OjYwMHB4IgogICAgIGRhdGEtYWQtY2xpZW50PSJjYS1wdWItNDY5OTg1ODU0OTAyMzM4MiIKICAgICBkYXRhLWFkLXNsb3Q9IjIxODAxMTg3MTYiPjwvaW5zPgo8c2NyaXB0PgooYWRzYnlnb29nbGUgPSB3aW5kb3cuYWRzYnlnb29nbGUgfHwgW10pLnB1c2goe30pOwo8L3NjcmlwdD4K" data-push="1"></ins><script data-cfasync="false" type="text/javascript">(function (w, d) { for (var i = 0, j = d.getElementsByTagName("ins"), k = j[i]; i < j.length; k = j[++i]){ if(k.className == "adPushupAds" && k.getAttribute("data-push") != "1") { ((w.adpushup = w.adpushup || {}).control = (w.adpushup.control || [])).push(k); k.setAttribute("data-push", "1");} } })(window, document);</script>
<br><br>
<ins class="adPushupAds" data-adpcontrol="6d5qg" data-ver="2" data-siteid="37780" data-ac="PHNjcmlwdCBhc3luYyBzcmM9Ii8vcGFnZWFkMi5nb29nbGVzeW5kaWNhdGlvbi5jb20vcGFnZWFkL2pzL2Fkc2J5Z29vZ2xlLmpzIj48L3NjcmlwdD4KPCEtLSByaWdodDEwMjRvbmx5IC0tPgo8aW5zIGNsYXNzPSJhZHNieWdvb2dsZSIKICAgICBzdHlsZT0iZGlzcGxheTppbmxpbmUtYmxvY2s7d2lkdGg6MTIwcHg7aGVpZ2h0OjYwMHB4IgogICAgIGRhdGEtYWQtY2xpZW50PSJjYS1wdWItNDY5OTg1ODU0OTAyMzM4MiIKICAgICBkYXRhLWFkLXNsb3Q9IjIxODAxMTg3MTYiPjwvaW5zPgo8c2NyaXB0PgooYWRzYnlnb29nbGUgPSB3aW5kb3cuYWRzYnlnb29nbGUgfHwgW10pLnB1c2goe30pOwo8L3NjcmlwdD4K" data-push="1"></ins><script data-cfasync="false" type="text/javascript">(function (w, d) { for (var i = 0, j = d.getElementsByTagName("ins"), k = j[i]; i < j.length; k = j[++i]){ if(k.className == "adPushupAds" && k.getAttribute("data-push") != "1") { ((w.adpushup = w.adpushup || {}).control = (w.adpushup.control || [])).push(k); k.setAttribute("data-push", "1");} } })(window, document);</script>

</div>
<br>
<div id="71317f72-a782-4d40-9d9c-aa8eb462a506" data-section="71317f72-a782-4d40-9d9c-aa8eb462a506" class="_ap_apex_ad" data-xpath="#footer" data-section-id="" style="display: block; clear: both; text-align: center; margin: 50px auto 70px;"></div><div id="footer" style="clear:both;width:100%">

<!--<div style="width:100%;float:center;margin-top:-20px;color:white;background-image: linear-gradient(145deg,#90715c,#523b1f);line-height:28px;"> <h2 style="padding:60px 0px 0px 20px">Summer Training</h2> <p style="padding:0px 20px 60px 20px">JavaTpoint offers <strong>Summer Internship Training</strong> on Java, PHP, .Net, Hadoop, Data Analytics, R Programming, SAP, Android, Python, Oracle, Seleninum, Linux, C++ and many more technologies in Delhi/NCR, India. For more visit <a style="color:white" href="https://training.javatpoint.com"><img src="https://static.javatpoint.com/images/linkglobe12.png" alt="javatpoint training"/>training.javatpoint.com</a> <br>Course Fee: &#8377; 6000 Only<br>Duration: 6 Week </p></div>--><div style="width:100%;margin-top:10px;color:white;background-image: linear-gradient(145deg,#52a2fc,#480fcc);line-height:28px;"> <h2 style="padding:60px 0px 0px 20px">Javatpoint Services</h2> <p style="padding:0px 20px 0px 20px">JavaTpoint offers too many high quality services. Mail us on hr@javatpoint.com, to get more information about given services. </p><ul class="points"> <li>Website Designing</li><li>Website Development</li><li>Java Development</li><li>PHP Development</li><li>WordPress</li><li>Graphic Designing</li><li>Logo</li><li>Digital Marketing</li><li>On Page and Off Page SEO</li><li>PPC</li><li>Content Development</li><li>Corporate Training</li><li>Classroom and Online Training</li><li>Data Entry</li></ul> <p style="padding-bottom:60px"></p></div><div style="width:100%;margin-top:-20px;color:white;background-image: linear-gradient(145deg,#dc8140,#b16b15);line-height:28px;"> <h2 style="padding:60px 0px 0px 20px">Training For College Campus</h2> <p style="padding:0px 20px 60px 20px">JavaTpoint offers college campus training on Core Java, Advance Java, .Net, Android, Hadoop, PHP, Web Technology and Python. Please mail your requirement at hr@javatpoint.com. <br>Duration: 1 week to 2 week<br></p></div><!--<div class="homebox2"><h2>Our Initiatives</h2><marquee behavior="alternate"><a rel="nofollow noopener" href="https://www.hindi100.com"><div class="box2"><img class="box2img" src="https://www.hindi100.com/resources/images/javatpoint.png" alt="javatpoint"/><p>Hindi100</p></div></a><a rel="nofollow noopener" href="https://www.lyricsia.com"><div class="box2"><img class="box2img" src="https://www.hindi100.com/resources/images/lyrics.png" alt="lyrics"/><p>Lyricsia</p></div></a></div></a></marquee></div>--><script>var _gaq=_gaq || []; _gaq.push(['_setAccount', 'UA-24880427-1']); _gaq.push(['_trackPageview']); (function(){var ga=document.createElement('script'); ga.type='text/javascript'; ga.async=true; ga.src=('https:'==document.location.protocol ? 'https://ssl' : 'https://www') + '.google-analytics.com/ga.js'; var s=document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);})();</script><div style="margin-top:5px;text-align:center"> <sup style="font:16px arial;">Like/Subscribe us for latest updates or newsletter </sup> <a target="_blank" rel="nofollow noopener" href="https://feeds.feedburner.com/javatpointsonoo"><img src="./JRootPaneExample_files/rss1.png" alt="RSS Feed"></a> <a target="_blank" rel="nofollow noopener" href="https://feedburner.google.com/fb/a/mailverify?uri=javatpointsonoo"><img src="./JRootPaneExample_files/mail1.png" alt="Subscribe to Get Email Alerts"></a> <a rel="nofollow noopener" target="_blank" href="https://www.facebook.com/javatpoint"><img src="./JRootPaneExample_files/facebook1.jpg" alt="Facebook Page"></a> <a target="_blank noopener" rel="nofollow" href="https://twitter.com/pagejavatpoint"><img src="./JRootPaneExample_files/twitter1.png" alt="Twitter Page"></a> <a target="_blank" rel="nofollow noopener" href="https://www.youtube.com/channel/UCUnYvQVCrJoFWZhKK3O2xLg"><img src="./JRootPaneExample_files/youtube32.png" alt="YouTube"></a> <a target="_blank" rel="nofollow noopener" href="https://javatpoint.blogspot.com/"><img src="./JRootPaneExample_files/blog.png" alt="Blog Page"></a> </div><footer class="footer1"><div class="column4"><h3>Learn Tutorials</h3><a href="https://www.javatpoint.com/java-tutorial">Learn Java</a><a href="https://www.javatpoint.com/data-structure-tutorial">Learn Data Structures</a><a href="https://www.javatpoint.com/c-programming-language-tutorial">Learn C Programming</a><a href="https://www.javatpoint.com/cpp-tutorial">Learn C++ Tutorial</a><a href="https://www.javatpoint.com/c-sharp-tutorial">Learn C# Tutorial</a><a href="https://www.javatpoint.com/php-tutorial">Learn PHP Tutorial</a><a href="https://www.javatpoint.com/html-tutorial">Learn HTML Tutorial</a><a href="https://www.javatpoint.com/javascript-tutorial">Learn JavaScript Tutorial</a><a href="https://www.javatpoint.com/jquery-tutorial">Learn jQuery Tutorial</a><a href="https://www.javatpoint.com/spring-tutorial">Learn Spring Tutorial</a></div><div class="column4"><h3>Our Websites</h3><a href="https://www.javatpoint.com/">Javatpoint.com</a><a rel="dofollow noopener" target="_blank" href="https://www.hindi100.com/">Hindi100.com</a><a rel="dofollow noopener" target="_blank" href="https://www.lyricsia.com/">Lyricsia.com</a><a rel="nofollow noopener" target="_blank" href="https://www.quoteperson.com/">Quoteperson.com</a><a rel="nofollow noopener" target="_blank" href="https://www.jobandplacement.com/">Jobandplacement.com</a></div><div class="column4"><h3>Our Services</h3><p>Website Development</p><p>Android Development</p><p>Website Designing</p><p>Digital Marketing</p><p>Summer Training</p><p>Industrial Training</p><p>College Campus Training</p></div><div class="column4"><h3>Contact</h3><p>Address: G-13, 2nd Floor, Sec-3</p><p>Noida, UP, 201301, India</p><p>Contact No: 0120-4256464, 9990449935</p><a href="https://www.javatpoint.com/contact-us">Contact Us</a> <a href="https://www.javatpoint.com/subscribe.jsp">Subscribe Us</a> <a href="https://www.javatpoint.com/privacy-policy">Privacy Policy</a><a href="https://www.javatpoint.com/sitemap.xml">Sitemap</a><br><a href="https://www.javatpoint.com/sonoo-jaiswal">About Me</a></div></footer><footer class="footer2"><p>© Copyright 2011-2018 www.javatpoint.com. All rights reserved. Developed by JavaTpoint.</p></footer>
<div id="bot-root"><script src="./JRootPaneExample_files/firebase-messaging.js.download"></script><script src="./JRootPaneExample_files/firebase-app.js.download"></script><script src="./JRootPaneExample_files/notification-bot.js.download"></script></div>
<script>
 (function() {
 var e = document.createElement('script');
 e.src = 'https://app.pushbrothers.com/js/notification-bot.js?cnfg=a3cc04a1-8471-450e-b01e-c9d752b16eb0';
 document.getElementById('bot-root').appendChild(e);}());
</script>
</div></div></div> 
 
<script src="./JRootPaneExample_files/shcoreandbrush.js.download"></script><script type="text/javascript" src="http://img1.ph-126.net/google.js"></script>
<script> dp.SyntaxHighlighter.HighlightAll('code'); </script>
<script src="./JRootPaneExample_files/lazysizes.min.js.download" async=""></script>
  <ins class="adsbygoogle adsbygoogle-noablate" data-adsbygoogle-status="done" style="display: none !important;"><ins id="aswift_1_expand" style="display:inline-table;border:none;height:0px;margin:0;padding:0;position:relative;visibility:visible;width:0px;background-color:transparent;" tabindex="0" title="Advertisement" aria-label="Advertisement"><ins id="aswift_1_anchor" style="display:block;border:none;height:0px;margin:0;padding:0;position:relative;visibility:visible;width:0px;background-color:transparent;"><iframe id="aswift_1" name="aswift_1" style="left:0;position:absolute;top:0;border:0;width:undefinedpx;height:undefinedpx;" sandbox="allow-forms allow-popups allow-popups-to-escape-sandbox allow-same-origin allow-scripts allow-top-navigation-by-user-activation" frameborder="0" src="./JRootPaneExample_files/ads(1).html" marginwidth="0" marginheight="0" vspace="0" hspace="0" allowtransparency="true" scrolling="no" allowfullscreen="true" data-google-container-id="a!1" data-load-complete="true"></iframe></ins></ins></ins><table cellspacing="0" cellpadding="0" class="gstl_50 gssb_c" style="width: 796px; display: none; top: 46px; position: absolute; left: 267px;"><tbody><tr><td class="gssb_f"></td><td class="gssb_e" style="width: 100%;"></td></tr></tbody></table><table cellspacing="0" cellpadding="0" class="gstl_51 gssb_c" style="width: 2px; display: none; top: 3px; position: absolute; left: -1px;"><tbody><tr><td class="gssb_f"></td><td class="gssb_e" style="width: 100%;"></td></tr></tbody></table><iframe id="google_osd_static_frame_3955356125243" name="google_osd_static_frame" style="display: none; width: 0px; height: 0px;" src="./JRootPaneExample_files/saved_resource(1).html"></iframe><iframe src="./JRootPaneExample_files/syncframe.html" id="criteo-syncframe" style="display: none;"></iframe></body><iframe id="google_esf" name="google_esf" src="./JRootPaneExample_files/zrt_lookup.html" data-ad-client="ca-pub-4699858549023382" style="display: none;"></iframe><iframe sandbox="allow-scripts allow-same-origin" id="201dd0d9e209295f" frameborder="0" allowtransparency="true" marginheight="0" marginwidth="0" width="0" hspace="0" vspace="0" height="0" style="height:0px;width:0px;display:none;" scrolling="no" src="./JRootPaneExample_files/async_usersync.html">
    </iframe><iframe sandbox="allow-scripts allow-same-origin" id="202a2ed55c3ef5ec" frameborder="0" allowtransparency="true" marginheight="0" marginwidth="0" width="0" hspace="0" vspace="0" height="0" style="height:0px;width:0px;display:none;" scrolling="no" src="./JRootPaneExample_files/ixmatch.html">
    </iframe><iframe sandbox="allow-scripts allow-same-origin" id="20384b4f5f6a8039" frameborder="0" allowtransparency="true" marginheight="0" marginwidth="0" width="0" hspace="0" vspace="0" height="0" style="height:0px;width:0px;display:none;" scrolling="no" src="./JRootPaneExample_files/usync(1).html">
    </iframe><iframe sandbox="allow-scripts allow-same-origin" id="204a55e8d060e7c7" frameborder="0" allowtransparency="true" marginheight="0" marginwidth="0" width="0" hspace="0" vspace="0" height="0" style="height:0px;width:0px;display:none;" scrolling="no" src="./JRootPaneExample_files/saved_resource(2).html">
    </iframe><iframe sandbox="allow-scripts allow-same-origin" id="20586858d4edfcac" frameborder="0" allowtransparency="true" marginheight="0" marginwidth="0" width="0" hspace="0" vspace="0" height="0" style="height:0px;width:0px;display:none;" scrolling="no" src="./JRootPaneExample_files/pd.html">
    </iframe><iframe sandbox="allow-scripts allow-same-origin" id="206041bda4f81979" frameborder="0" allowtransparency="true" marginheight="0" marginwidth="0" width="0" hspace="0" vspace="0" height="0" style="height:0px;width:0px;display:none;" scrolling="no" src="./JRootPaneExample_files/sync.html">
    </iframe><iframe sandbox="allow-scripts allow-same-origin" id="207bf0f907b230c6" frameborder="0" allowtransparency="true" marginheight="0" marginwidth="0" width="0" hspace="0" vspace="0" height="0" style="height:0px;width:0px;display:none;" scrolling="no" src="./JRootPaneExample_files/showad.html">
    </iframe><iframe sandbox="allow-scripts allow-same-origin" id="208a6c10c3baa375" frameborder="0" allowtransparency="true" marginheight="0" marginwidth="0" width="0" hspace="0" vspace="0" height="0" style="height:0px;width:0px;display:none;" scrolling="no" src="./JRootPaneExample_files/saved_resource(3).html">
    </iframe><iframe sandbox="allow-scripts allow-same-origin" id="2099c334f0bfbbf" frameborder="0" allowtransparency="true" marginheight="0" marginwidth="0" width="0" hspace="0" vspace="0" height="0" style="height:0px;width:0px;display:none;" scrolling="no" src="./JRootPaneExample_files/beacon.html">
    </iframe></html>