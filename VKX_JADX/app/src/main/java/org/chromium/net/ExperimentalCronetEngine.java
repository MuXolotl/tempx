package org.chromium.net;

import android.content.Context;
import defpackage.AbstractC15560l;
import defpackage.C11650l;
import defpackage.C4875l;
import defpackage.C8339l;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class ExperimentalCronetEngine extends CronetEngine {
    public static final int CONNECTION_METRIC_UNKNOWN = -1;
    public static final int EFFECTIVE_CONNECTION_TYPE_2G = 3;
    public static final int EFFECTIVE_CONNECTION_TYPE_3G = 4;
    public static final int EFFECTIVE_CONNECTION_TYPE_4G = 5;
    public static final int EFFECTIVE_CONNECTION_TYPE_OFFLINE = 1;
    public static final int EFFECTIVE_CONNECTION_TYPE_SLOW_2G = 2;
    public static final int EFFECTIVE_CONNECTION_TYPE_UNKNOWN = 0;
    public static final long UNBIND_NETWORK_HANDLE = -1;

    public abstract ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor);

    @Override // org.chromium.net.CronetEngine
    public abstract ExperimentalUrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor);

    public URLConnection openConnection(URL url, Proxy proxy) {
        return url.openConnection(proxy);
    }

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    public static class Builder extends CronetEngine.Builder {
        private final List<loadAd> mExperimentalOptionsPatches;
        private JSONObject mParsedExperimentalOptions;

        public Builder(Context context) {
            super(context);
            this.mExperimentalOptionsPatches = new ArrayList();
        }

        private static JSONObject createDefaultIfAbsent(JSONObject jSONObject, String str) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
            if (jSONObjectOptJSONObject != null) {
                return jSONObjectOptJSONObject;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject.put(str, jSONObject2);
                return jSONObject2;
            } catch (JSONException e) {
                throw new IllegalArgumentException(AbstractC15560l.Signature("Failed adding a default object for key [", str, "]"), e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$setConnectionMigrationOptions$2(ConnectionMigrationOptions connectionMigrationOptions, JSONObject jSONObject) throws JSONException {
            JSONObject jSONObjectCreateDefaultIfAbsent = createDefaultIfAbsent(jSONObject, "QUIC");
            if (connectionMigrationOptions.getEnableDefaultNetworkMigration() != null) {
                jSONObjectCreateDefaultIfAbsent.put("migrate_sessions_on_network_change_v2", connectionMigrationOptions.getEnableDefaultNetworkMigration());
            }
            if (connectionMigrationOptions.getAllowServerMigration() != null) {
                jSONObjectCreateDefaultIfAbsent.put("allow_server_migration", connectionMigrationOptions.getAllowServerMigration());
            }
            if (connectionMigrationOptions.getMigrateIdleConnections() != null) {
                jSONObjectCreateDefaultIfAbsent.put("migrate_idle_sessions", connectionMigrationOptions.getMigrateIdleConnections());
            }
            if (connectionMigrationOptions.getIdleMigrationPeriodSeconds() != null) {
                jSONObjectCreateDefaultIfAbsent.put("idle_session_migration_period_seconds", connectionMigrationOptions.getIdleMigrationPeriodSeconds());
            }
            if (connectionMigrationOptions.getRetryPreHandshakeErrorsOnAlternateNetwork() != null) {
                jSONObjectCreateDefaultIfAbsent.put("retry_on_alternate_network_before_handshake", connectionMigrationOptions.getRetryPreHandshakeErrorsOnAlternateNetwork());
            }
            if (connectionMigrationOptions.getMaxTimeOnNonDefaultNetworkSeconds() != null) {
                jSONObjectCreateDefaultIfAbsent.put("max_time_on_non_default_network_seconds", connectionMigrationOptions.getMaxTimeOnNonDefaultNetworkSeconds());
            }
            if (connectionMigrationOptions.getMaxPathDegradingEagerMigrationsCount() != null) {
                jSONObjectCreateDefaultIfAbsent.put("max_migrations_to_non_default_network_on_path_degrading", connectionMigrationOptions.getMaxPathDegradingEagerMigrationsCount());
            }
            if (connectionMigrationOptions.getMaxWriteErrorEagerMigrationsCount() != null) {
                jSONObjectCreateDefaultIfAbsent.put("max_migrations_to_non_default_network_on_write_error", connectionMigrationOptions.getMaxWriteErrorEagerMigrationsCount());
            }
            if (connectionMigrationOptions.getEnablePathDegradationMigration() != null) {
                boolean zBooleanValue = connectionMigrationOptions.getEnablePathDegradationMigration().booleanValue();
                if (connectionMigrationOptions.getAllowNonDefaultNetworkUsage() != null) {
                    boolean zBooleanValue2 = connectionMigrationOptions.getAllowNonDefaultNetworkUsage().booleanValue();
                    if (!zBooleanValue && zBooleanValue2) {
                        C8339l.metrica("Unable to turn on non-default network usage without path degradation migration!");
                        return;
                    } else {
                        if (zBooleanValue && zBooleanValue2) {
                            jSONObjectCreateDefaultIfAbsent.put("migrate_sessions_early_v2", true);
                            return;
                        }
                        jSONObjectCreateDefaultIfAbsent.put("migrate_sessions_early_v2", false);
                    }
                }
                jSONObjectCreateDefaultIfAbsent.put("allow_port_migration", zBooleanValue);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$setDnsOptions$1(DnsOptions dnsOptions, JSONObject jSONObject) throws JSONException {
            JSONObject jSONObjectCreateDefaultIfAbsent = createDefaultIfAbsent(jSONObject, "AsyncDNS");
            if (dnsOptions.getUseBuiltInDnsResolver() != null) {
                jSONObjectCreateDefaultIfAbsent.put("enable", dnsOptions.getUseBuiltInDnsResolver());
            }
            JSONObject jSONObjectCreateDefaultIfAbsent2 = createDefaultIfAbsent(jSONObject, "StaleDNS");
            if (dnsOptions.getEnableStaleDns() != null) {
                jSONObjectCreateDefaultIfAbsent2.put("enable", dnsOptions.getEnableStaleDns());
            }
            if (dnsOptions.getPersistHostCache() != null) {
                jSONObjectCreateDefaultIfAbsent2.put("persist_to_disk", dnsOptions.getPersistHostCache());
            }
            if (dnsOptions.getPersistHostCachePeriodMillis() != null) {
                jSONObjectCreateDefaultIfAbsent2.put("persist_delay_ms", dnsOptions.getPersistHostCachePeriodMillis());
            }
            if (dnsOptions.getStaleDnsOptions() != null) {
                DnsOptions.StaleDnsOptions staleDnsOptions = dnsOptions.getStaleDnsOptions();
                if (staleDnsOptions.getAllowCrossNetworkUsage() != null) {
                    jSONObjectCreateDefaultIfAbsent2.put("allow_other_network", staleDnsOptions.getAllowCrossNetworkUsage());
                }
                if (staleDnsOptions.getFreshLookupTimeoutMillis() != null) {
                    jSONObjectCreateDefaultIfAbsent2.put("delay_ms", staleDnsOptions.getFreshLookupTimeoutMillis());
                }
                if (staleDnsOptions.getUseStaleOnNameNotResolved() != null) {
                    jSONObjectCreateDefaultIfAbsent2.put("use_stale_on_name_not_resolved", staleDnsOptions.getUseStaleOnNameNotResolved());
                }
                if (staleDnsOptions.getMaxExpiredDelayMillis() != null) {
                    jSONObjectCreateDefaultIfAbsent2.put("max_expired_time_ms", staleDnsOptions.getMaxExpiredDelayMillis());
                }
            }
            JSONObject jSONObjectCreateDefaultIfAbsent3 = createDefaultIfAbsent(jSONObject, "QUIC");
            if (dnsOptions.getPreestablishConnectionsToStaleDnsResults() != null) {
                jSONObjectCreateDefaultIfAbsent3.put("race_stale_dns_on_connection", dnsOptions.getPreestablishConnectionsToStaleDnsResults());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$setQuicOptions$0(QuicOptions quicOptions, JSONObject jSONObject) throws JSONException {
            JSONObject jSONObjectCreateDefaultIfAbsent = createDefaultIfAbsent(jSONObject, "QUIC");
            if (!quicOptions.getQuicHostAllowlist().isEmpty()) {
                Set<String> quicHostAllowlist = quicOptions.getQuicHostAllowlist();
                StringBuilder sb = new StringBuilder();
                Iterator<T> it = quicHostAllowlist.iterator();
                if (it.hasNext()) {
                    while (true) {
                        sb.append((CharSequence) it.next());
                        if (!it.hasNext()) {
                            break;
                        } else {
                            sb.append((CharSequence) ",");
                        }
                    }
                }
                jSONObjectCreateDefaultIfAbsent.put("host_whitelist", sb.toString());
            }
            if (!quicOptions.getEnabledQuicVersions().isEmpty()) {
                Set<String> enabledQuicVersions = quicOptions.getEnabledQuicVersions();
                StringBuilder sb2 = new StringBuilder();
                Iterator<T> it2 = enabledQuicVersions.iterator();
                if (it2.hasNext()) {
                    while (true) {
                        sb2.append((CharSequence) it2.next());
                        if (!it2.hasNext()) {
                            break;
                        } else {
                            sb2.append((CharSequence) ",");
                        }
                    }
                }
                jSONObjectCreateDefaultIfAbsent.put("quic_version", sb2.toString());
            }
            if (!quicOptions.getConnectionOptions().isEmpty()) {
                Set<String> connectionOptions = quicOptions.getConnectionOptions();
                StringBuilder sb3 = new StringBuilder();
                Iterator<T> it3 = connectionOptions.iterator();
                if (it3.hasNext()) {
                    while (true) {
                        sb3.append((CharSequence) it3.next());
                        if (!it3.hasNext()) {
                            break;
                        } else {
                            sb3.append((CharSequence) ",");
                        }
                    }
                }
                jSONObjectCreateDefaultIfAbsent.put("connection_options", sb3.toString());
            }
            if (!quicOptions.getClientConnectionOptions().isEmpty()) {
                Set<String> clientConnectionOptions = quicOptions.getClientConnectionOptions();
                StringBuilder sb4 = new StringBuilder();
                Iterator<T> it4 = clientConnectionOptions.iterator();
                if (it4.hasNext()) {
                    while (true) {
                        sb4.append((CharSequence) it4.next());
                        if (!it4.hasNext()) {
                            break;
                        } else {
                            sb4.append((CharSequence) ",");
                        }
                    }
                }
                jSONObjectCreateDefaultIfAbsent.put("client_connection_options", sb4.toString());
            }
            if (!quicOptions.getExtraQuicheFlags().isEmpty()) {
                Set<String> extraQuicheFlags = quicOptions.getExtraQuicheFlags();
                StringBuilder sb5 = new StringBuilder();
                Iterator<T> it5 = extraQuicheFlags.iterator();
                if (it5.hasNext()) {
                    while (true) {
                        sb5.append((CharSequence) it5.next());
                        if (!it5.hasNext()) {
                            break;
                        } else {
                            sb5.append((CharSequence) ",");
                        }
                    }
                }
                jSONObjectCreateDefaultIfAbsent.put("set_quic_flags", sb5.toString());
            }
            if (quicOptions.getInMemoryServerConfigsCacheSize() != null) {
                jSONObjectCreateDefaultIfAbsent.put("max_server_configs_stored_in_properties", quicOptions.getInMemoryServerConfigsCacheSize());
            }
            if (quicOptions.getHandshakeUserAgent() != null) {
                jSONObjectCreateDefaultIfAbsent.put("user_agent_id", quicOptions.getHandshakeUserAgent());
            }
            if (quicOptions.getRetryWithoutAltSvcOnQuicErrors() != null) {
                jSONObjectCreateDefaultIfAbsent.put("retry_without_alt_svc_on_quic_errors", quicOptions.getRetryWithoutAltSvcOnQuicErrors());
            }
            if (quicOptions.getEnableTlsZeroRtt() != null) {
                jSONObjectCreateDefaultIfAbsent.put("disable_tls_zero_rtt", !quicOptions.getEnableTlsZeroRtt().booleanValue());
            }
            if (quicOptions.getPreCryptoHandshakeIdleTimeoutSeconds() != null) {
                jSONObjectCreateDefaultIfAbsent.put("max_idle_time_before_crypto_handshake_seconds", quicOptions.getPreCryptoHandshakeIdleTimeoutSeconds());
            }
            if (quicOptions.getCryptoHandshakeTimeoutSeconds() != null) {
                jSONObjectCreateDefaultIfAbsent.put("max_time_before_crypto_handshake_seconds", quicOptions.getCryptoHandshakeTimeoutSeconds());
            }
            if (quicOptions.getIdleConnectionTimeoutSeconds() != null) {
                jSONObjectCreateDefaultIfAbsent.put("idle_connection_timeout_seconds", quicOptions.getIdleConnectionTimeoutSeconds());
            }
            if (quicOptions.getRetransmittableOnWireTimeoutMillis() != null) {
                jSONObjectCreateDefaultIfAbsent.put("retransmittable_on_wire_timeout_milliseconds", quicOptions.getRetransmittableOnWireTimeoutMillis());
            }
            if (quicOptions.getCloseSessionsOnIpChange() != null) {
                jSONObjectCreateDefaultIfAbsent.put("close_sessions_on_ip_change", quicOptions.getCloseSessionsOnIpChange());
            }
            if (quicOptions.getGoawaySessionsOnIpChange() != null) {
                jSONObjectCreateDefaultIfAbsent.put("goaway_sessions_on_ip_change", quicOptions.getGoawaySessionsOnIpChange());
            }
            if (quicOptions.getInitialBrokenServicePeriodSeconds() != null) {
                jSONObjectCreateDefaultIfAbsent.put("initial_delay_for_broken_alternative_service_seconds", quicOptions.getInitialBrokenServicePeriodSeconds());
            }
            if (quicOptions.getIncreaseBrokenServicePeriodExponentially() != null) {
                jSONObjectCreateDefaultIfAbsent.put("exponential_backoff_on_initial_delay", quicOptions.getIncreaseBrokenServicePeriodExponentially());
            }
            if (quicOptions.getDelayJobsWithAvailableSpdySession() != null) {
                jSONObjectCreateDefaultIfAbsent.put("delay_main_job_with_available_spdy_session", quicOptions.getDelayJobsWithAvailableSpdySession());
            }
        }

        private static JSONObject parseExperimentalOptions(String str) {
            try {
                return new JSONObject(str);
            } catch (JSONException e) {
                throw new IllegalArgumentException("Experimental options parsing failed", e);
            }
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public /* bridge */ /* synthetic */ CronetEngine.Builder addPublicKeyPins(String str, Set set, boolean z, Date date) {
            return addPublicKeyPins(str, (Set<byte[]>) set, z, date);
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public ExperimentalCronetEngine build() {
            if (this.mParsedExperimentalOptions == null && this.mExperimentalOptionsPatches.isEmpty()) {
                return this.mBuilderDelegate.build();
            }
            if (this.mParsedExperimentalOptions == null) {
                this.mParsedExperimentalOptions = new JSONObject();
            }
            Iterator<loadAd> it = this.mExperimentalOptionsPatches.iterator();
            while (it.hasNext()) {
                try {
                    it.next().yandex(this.mParsedExperimentalOptions);
                } catch (JSONException e) {
                    C4875l.remoteconfig("Unable to apply JSON patch!", e);
                    return null;
                }
            }
            this.mBuilderDelegate.setExperimentalOptions(this.mParsedExperimentalOptions.toString());
            return this.mBuilderDelegate.build();
        }

        public ICronetEngineBuilder getBuilderDelegate() {
            return this.mBuilderDelegate;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        @ConnectionMigrationOptions.Experimental
        public Builder setConnectionMigrationOptions(ConnectionMigrationOptions connectionMigrationOptions) {
            if (this.mBuilderDelegate.getSupportedConfigOptions().contains(1)) {
                this.mBuilderDelegate.setConnectionMigrationOptions(connectionMigrationOptions);
                return this;
            }
            this.mExperimentalOptionsPatches.add(new C11650l(2, connectionMigrationOptions));
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        @DnsOptions.Experimental
        public Builder setDnsOptions(DnsOptions dnsOptions) {
            if (this.mBuilderDelegate.getSupportedConfigOptions().contains(2)) {
                this.mBuilderDelegate.setDnsOptions(dnsOptions);
                return this;
            }
            this.mExperimentalOptionsPatches.add(new C11650l(1, dnsOptions));
            return this;
        }

        public Builder setExperimentalOptions(String str) {
            if (str == null || str.isEmpty()) {
                this.mParsedExperimentalOptions = null;
                return this;
            }
            this.mParsedExperimentalOptions = parseExperimentalOptions(str);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        @QuicOptions.Experimental
        public Builder setQuicOptions(QuicOptions quicOptions) {
            if (this.mBuilderDelegate.getSupportedConfigOptions().contains(3)) {
                this.mBuilderDelegate.setQuicOptions(quicOptions);
                return this;
            }
            this.mExperimentalOptionsPatches.add(new C11650l(0, quicOptions));
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder addPublicKeyPins(String str, Set<byte[]> set, boolean z, Date date) {
            super.addPublicKeyPins(str, set, z, date);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder addQuicHint(String str, int i, int i2) {
            super.addQuicHint(str, i, i2);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder enableHttp2(boolean z) {
            super.enableHttp2(z);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder enableHttpCache(int i, long j) {
            super.enableHttpCache(i, j);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder enableNetworkQualityEstimator(boolean z) {
            super.enableNetworkQualityEstimator(z);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
            super.enablePublicKeyPinningBypassForLocalTrustAnchors(z);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder enableQuic(boolean z) {
            super.enableQuic(z);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder enableSdch(boolean z) {
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
            super.setLibraryLoader(libraryLoader);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder setStoragePath(String str) {
            super.setStoragePath(str);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder setThreadPriority(int i) {
            super.setThreadPriority(i);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder setUserAgent(String str) {
            super.setUserAgent(str);
            return this;
        }

        public Builder(ICronetEngineBuilder iCronetEngineBuilder) {
            super(iCronetEngineBuilder);
            this.mExperimentalOptionsPatches = new ArrayList();
        }
    }

    public void bindToNetwork(long j) {
    }
}
