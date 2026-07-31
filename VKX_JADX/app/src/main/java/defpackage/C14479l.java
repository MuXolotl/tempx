package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolException;
import kotlin.Unit;

/* JADX INFO: renamed from: lٓۡ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14479l implements InterfaceC18477l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C14690l f28347l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final C14479l f28348l;

    static {
        EnumC15312l enumC15312l = EnumC15312l.RECOMMENDATIONS;
        f28348l = new C14479l();
        f28347l = new C14690l(enumC15312l, C2580l.f5619l, 0L, C3844l.f7950l);
    }

    @Override // defpackage.InterfaceC18477l
    /* JADX INFO: renamed from: lؘؓؖ */
    public final Object mo2330l() {
        return f28347l;
    }

    @Override // defpackage.InterfaceC18477l
    /* JADX INFO: renamed from: lٖؖ۠ */
    public final Object mo2331l(InputStream inputStream) throws C16916l {
        try {
            C1301l c1301l = C14690l.f28752l;
            c1301l.getClass();
            return (C14690l) c1301l.crashlytics(new C7084l(new C1503l(AbstractC7709l.purchase(inputStream))));
        } catch (ProtocolException unused) {
            throw new C16916l("Widget DataStore Proto was corrupted!", null);
        }
    }

    @Override // defpackage.InterfaceC18477l
    /* JADX INFO: renamed from: lٌّۡ */
    public final Unit mo2332l(OutputStream outputStream, Object obj) {
        C14690l.f28752l.mopub(outputStream, (C14690l) obj);
        return Unit.INSTANCE;
    }
}
