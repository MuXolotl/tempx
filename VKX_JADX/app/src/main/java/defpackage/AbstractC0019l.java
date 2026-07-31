package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lَؑؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0019l {
    public final /* synthetic */ int yandex = 3;

    public static final InterfaceC17242l amazon(InterfaceC17242l interfaceC17242l) {
        return AbstractC7477l.crashlytics(interfaceC17242l, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 1044479);
    }

    public static final InterfaceC17242l billing(InterfaceC17242l interfaceC17242l, C12660l c12660l) {
        return interfaceC17242l.premium(new C12201l(c12660l));
    }

    public static final InterfaceC17242l crashlytics(InterfaceC17242l interfaceC17242l, InterfaceC6347l interfaceC6347l) {
        return AbstractC7477l.crashlytics(interfaceC17242l, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, interfaceC6347l, true, 1042431);
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0100  */
    public static C5222l purchase(Class cls) {
        C11906l c11906l;
        InterfaceC14209l c15053l;
        EnumC4474l enumC4474l;
        C14537l c14537l = new C14537l();
        c14537l.f28472l = null;
        c14537l.f28471l = null;
        boolean z = false;
        c14537l.f28468l = 0;
        c14537l.f28474l = null;
        c14537l.f28473l = null;
        c14537l.f28475l = null;
        c14537l.f28469l = null;
        c14537l.f28470l = null;
        for (Annotation annotation : cls.getDeclaredAnnotations()) {
            Class clsMo1730private = ((InterfaceC13937l) AbstractC16131l.billing(annotation)).mo1730private();
            C3624l c3624lYandex = AbstractC1845l.yandex(clsMo1730private);
            C2312l c2312lYandex = c3624lYandex.yandex();
            if (c2312lYandex.equals(AbstractC6830l.yandex)) {
                c15053l = new C5501l(22, c14537l);
            } else if (c2312lYandex.equals(AbstractC6830l.adcel)) {
                c15053l = new C5008l(20, c14537l);
            } else if (C14537l.f28467l || c14537l.f28469l != null || (enumC4474l = (EnumC4474l) C14537l.f28466l.get(c3624lYandex)) == null) {
                c15053l = null;
            } else {
                c14537l.f28469l = enumC4474l;
                c15053l = new C15053l(c14537l);
            }
            if (c15053l != null) {
                AbstractC1788l.subs(c15053l, annotation, clsMo1730private);
            }
        }
        C4995l c4995l = C4995l.mopub;
        if (c14537l.f28469l == null || c14537l.f28472l == null) {
            c11906l = null;
        } else {
            C4995l c4995l2 = new C4995l(c14537l.f28472l, (c14537l.f28468l & 8) != 0);
            C4995l c4995l3 = c4995l2.billing ? c4995l : C4995l.admob;
            int i = c4995l3.loadAd;
            int i2 = c4995l.loadAd;
            if (i > i2 || (i >= i2 && c4995l3.crashlytics > c4995l.crashlytics)) {
                c4995l = c4995l3;
            }
            int i3 = c4995l2.crashlytics;
            int i4 = c4995l2.loadAd;
            if ((i4 != 1 || i3 != 0) && i4 != 0) {
                int i5 = c4995l.loadAd;
                if (i4 > i5 || (i4 >= i5 && i3 > c4995l.crashlytics)) {
                    z = true;
                }
                z = !z;
            }
            if (z) {
                EnumC4474l enumC4474l2 = c14537l.f28469l;
                if ((enumC4474l2 == EnumC4474l.CLASS || enumC4474l2 == EnumC4474l.FILE_FACADE || enumC4474l2 == EnumC4474l.MULTIFILE_CLASS_PART) && c14537l.f28474l == null) {
                    c11906l = null;
                }
            } else {
                c14537l.f28475l = c14537l.f28474l;
                c14537l.f28474l = null;
            }
            String[] strArr = c14537l.f28470l;
            if (strArr != null) {
                AbstractC7418l.yandex(strArr);
            }
            c11906l = new C11906l(c14537l.f28469l, c4995l2, c14537l.f28474l, c14537l.f28475l, c14537l.f28473l, c14537l.f28471l, c14537l.f28468l);
        }
        if (c11906l == null) {
            return null;
        }
        return new C5222l(cls, c11906l);
    }

    public static final ArrayList yandex(List list) throws IOException, CertificateException {
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(((C5737l) it.next()).crashlytics.getBytes(AbstractC9050l.yandex));
            try {
                Collection<? extends Certificate> collectionGenerateCertificates = certificateFactory.generateCertificates(byteArrayInputStream);
                byteArrayInputStream.close();
                AbstractC3984l.license(arrayList, collectionGenerateCertificates);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC7876l.loadAd(byteArrayInputStream, th);
                    throw th2;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof X509Certificate) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public abstract String loadAd();

    public String toString() {
        switch (this.yandex) {
            case 3:
                return loadAd();
            default:
                return super.toString();
        }
    }
}
