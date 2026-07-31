package org.conscrypt;

import defpackage.AbstractC14238l;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SNIServerName;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
class Java8ExtendedSSLSession extends Java7ExtendedSSLSession {
    public Java8ExtendedSSLSession(ExternalSession externalSession) {
        super(externalSession);
    }

    @Override // javax.net.ssl.ExtendedSSLSession
    public final List<SNIServerName> getRequestedServerNames() {
        String requestedServerName = this.delegate.getRequestedServerName();
        return requestedServerName == null ? Collections.EMPTY_LIST : Collections.singletonList(AbstractC14238l.billing(requestedServerName));
    }
}
