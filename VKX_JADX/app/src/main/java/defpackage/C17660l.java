package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: l٘ؔ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17660l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f34422l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f34423l;

    public /* synthetic */ C17660l(InterfaceC8714l interfaceC8714l, int i) {
        this.f34423l = i;
        this.f34422l = interfaceC8714l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f34423l;
        InterfaceC8714l interfaceC8714l = this.f34422l;
        switch (i) {
            case 0:
                interfaceC8714l.setValue((String) obj);
                break;
            case 1:
                interfaceC8714l.setValue(obj);
                break;
            case 2:
                interfaceC8714l.setValue(Boolean.valueOf(((EnumC11822l) obj).yandex()));
                break;
            case 3:
                ((Function1) interfaceC8714l.getValue()).invoke((C1187l) obj);
                break;
            case 4:
                String str = (String) obj;
                StringBuilder sb = new StringBuilder();
                int length = str.length();
                for (int i2 = 0; i2 < length; i2++) {
                    char cCharAt = str.charAt(i2);
                    if (('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < 'g') || ('A' <= cCharAt && cCharAt < 'G'))) {
                        sb.append(cCharAt);
                    }
                }
                interfaceC8714l.setValue(sb.toString());
                break;
            case 5:
                interfaceC8714l.setValue((C12818l) obj);
                break;
            case 6:
                interfaceC8714l.setValue(new C1187l(((InterfaceC18212l) obj).startapp(0L)));
                break;
            default:
                interfaceC8714l.setValue((InterfaceC18212l) obj);
                break;
        }
        return Unit.INSTANCE;
    }
}
