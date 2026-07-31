package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍۘٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9773l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C17986l f19914l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f19915l;

    public /* synthetic */ C9773l(C17986l c17986l, int i) {
        this.f19915l = i;
        this.f19914l = c17986l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f19915l;
        C17986l c17986l = this.f19914l;
        switch (i) {
            case 0:
                ((Boolean) obj).getClass();
                c17986l.f35165l.setValue(Boolean.valueOf(!c17986l.signatures()));
                break;
            case 1:
                C0639l c0639l = (C0639l) obj;
                String str = c0639l.yandex.f7563l;
                StringBuilder sb = new StringBuilder();
                int length = str.length();
                for (int i2 = 0; i2 < length; i2++) {
                    char cCharAt = str.charAt(i2);
                    if (Character.isDigit(cCharAt)) {
                        sb.append(cCharAt);
                    }
                }
                c17986l.f35168l.setValue(C0639l.loadAd(c0639l, sb.toString()));
                break;
            default:
                ((Boolean) obj).getClass();
                c17986l.f35173l.setValue(Boolean.valueOf(!c17986l.isVip()));
                break;
        }
        return Unit.INSTANCE;
    }
}
