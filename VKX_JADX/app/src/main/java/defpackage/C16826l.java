package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: lٗؑؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16826l implements InterfaceC1910l {
    public final InterfaceC5706l crashlytics;
    public final Map loadAd;
    public final AbstractC18041l yandex;

    public C16826l(AbstractC15211l abstractC15211l, Map map, InterfaceC5706l interfaceC5706l) {
        if (abstractC15211l == null) {
            loadAd(0);
            throw null;
        }
        if (map == null) {
            loadAd(1);
            throw null;
        }
        this.yandex = abstractC15211l;
        this.loadAd = map;
        this.crashlytics = interfaceC5706l;
    }

    public static /* synthetic */ void loadAd(int i) {
        String str = (i == 3 || i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "valueArguments";
        } else if (i == 2) {
            objArr[0] = "source";
        } else if (i == 3 || i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i == 3) {
            objArr[1] = "getType";
        } else if (i == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 3 && i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 3 && i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.InterfaceC1910l
    public final Map admob() {
        Map map = this.loadAd;
        if (map != null) {
            return map;
        }
        loadAd(4);
        throw null;
    }

    @Override // defpackage.InterfaceC1910l
    public final InterfaceC5706l billing() {
        return this.crashlytics;
    }

    @Override // defpackage.InterfaceC1910l
    public final C2312l mopub() {
        InterfaceC17477l interfaceC17477lAmazon = AbstractC3759l.amazon(this);
        if (interfaceC17477lAmazon != null) {
            if (C8741l.purchase(interfaceC17477lAmazon)) {
                interfaceC17477lAmazon = null;
            }
            if (interfaceC17477lAmazon != null) {
                return AbstractC3759l.crashlytics(interfaceC17477lAmazon);
            }
        }
        return null;
    }

    public final String toString() {
        return C10822l.crashlytics.pro(this, null);
    }

    @Override // defpackage.InterfaceC1910l
    public final AbstractC18041l yandex() {
        AbstractC18041l abstractC18041l = this.yandex;
        if (abstractC18041l != null) {
            return abstractC18041l;
        }
        loadAd(3);
        throw null;
    }
}
