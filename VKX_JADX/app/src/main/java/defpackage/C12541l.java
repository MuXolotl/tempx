package defpackage;

import java.io.IOException;
import java.security.Principal;

/* JADX INFO: renamed from: lُّۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12541l extends C9130l implements Principal {
    public C12541l(C9130l c9130l) {
        super((Cclass) c9130l.billing());
    }

    @Override // defpackage.Cnative, defpackage.InterfaceC8635l
    public final byte[] getEncoded() {
        try {
            return remoteconfig("DER");
        } catch (IOException e) {
            C10754l.Signature(e);
            return null;
        }
    }

    public C12541l(C10915l c10915l) {
        super(c10915l.f22038l);
    }
}
