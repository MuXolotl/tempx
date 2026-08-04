package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lًؐۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7701l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C13157l f16173l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f16174l;

    public /* synthetic */ C7701l(C13157l c13157l, int i) {
        this.f16174l = i;
        this.f16173l = c13157l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f16174l;
        C2807l c2807l = C2807l.yandex;
        C13157l c13157l = this.f16173l;
        Boolean bool = (Boolean) obj;
        switch (i) {
            case 0:
                bool.getClass();
                c13157l.f25773l.setValue(bool);
                AbstractC8619l.remoteconfig.loadAd(bool);
                AbstractC12832l.mopub(c2807l, AbstractC11990l.firebase(c13157l));
                break;
            default:
                bool.booleanValue();
                C10086l c10086l = c13157l.f25770l;
                c10086l.setValue(bool);
                C11897l c11897l = AbstractC8619l.metrica;
                Boolean bool2 = (Boolean) c10086l.getValue();
                bool2.booleanValue();
                c11897l.loadAd(bool2);
                AbstractC12832l.mopub(c2807l, AbstractC11990l.firebase(c13157l));
                break;
        }
        return Unit.INSTANCE;
    }
}
