package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lِؓۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1802l extends AbstractC6280l {
    @Override // defpackage.AbstractC0757l
    public final String toString() {
        String strValueOf;
        Object obj = this.yandex;
        Integer numValueOf = Integer.valueOf(((Character) obj).charValue());
        char cCharValue = ((Character) obj).charValue();
        switch (cCharValue) {
            case '\b':
                strValueOf = "\\b";
                break;
            case '\t':
                strValueOf = "\\t";
                break;
            case '\n':
                strValueOf = "\\n";
                break;
            case 11:
            default:
                byte type = (byte) Character.getType(cCharValue);
                strValueOf = (type != 0 && type != 13 && type != 14 && type != 15 && type != 16 && type != 18 && type != 19) ? String.valueOf(cCharValue) : "?";
                break;
            case '\f':
                strValueOf = "\\f";
                break;
            case '\r':
                strValueOf = "\\r";
                break;
        }
        return String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{numValueOf, strValueOf}, 2));
    }

    @Override // defpackage.AbstractC0757l
    public final AbstractC18041l yandex(InterfaceC11865l interfaceC11865l) {
        AbstractC16860l abstractC16860lSubs = interfaceC11865l.subs();
        abstractC16860lSubs.getClass();
        return abstractC16860lSubs.subscription(EnumC15893l.CHAR);
    }
}
