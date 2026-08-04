package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lِؑٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0393l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C15308l f1497l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f1498l;

    public /* synthetic */ C0393l(C15308l c15308l, int i) {
        this.f1498l = i;
        this.f1497l = c15308l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f1498l;
        C15308l c15308l = this.f1497l;
        switch (i) {
            case 0:
                String str = (String) obj;
                StringBuilder sb = new StringBuilder();
                int length = str.length();
                for (int i2 = 0; i2 < length; i2++) {
                    char cCharAt = str.charAt(i2);
                    if (Character.isDigit(cCharAt)) {
                        sb.append(cCharAt);
                    }
                }
                Integer numSignatures = AbstractC16648l.signatures(sb.toString());
                c15308l.subs(numSignatures != null ? numSignatures.intValue() : 0);
                break;
            default:
                c15308l.subs(((Integer) obj).intValue());
                break;
        }
        return Unit.INSTANCE;
    }
}
