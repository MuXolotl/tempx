package defpackage;

import io.realm.kotlin.internal.interop.realm_value_t;

/* JADX INFO: renamed from: lٟٓٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14244l extends AbstractC14507l {
    public final /* synthetic */ int yandex;
    public static final C14244l loadAd = new C14244l(0);
    public static final C14244l crashlytics = new C14244l(1);
    public static final C14244l amazon = new C14244l(2);
    public static final C14244l purchase = new C14244l(3);

    public /* synthetic */ C14244l(int i) {
        this.yandex = i;
    }

    @Override // defpackage.AbstractC14507l
    public final realm_value_t billing(C3585l c3585l, Object obj) {
        switch (this.yandex) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return c3585l.isVip((Long) obj);
    }

    @Override // defpackage.AbstractC14507l
    public final Object loadAd(realm_value_t realm_value_tVar) {
        switch (this.yandex) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return AbstractC11043l.yandex(realm_value_tVar);
    }

    @Override // defpackage.AbstractC14507l
    public final /* bridge */ /* synthetic */ Object purchase(Object obj) {
        switch (this.yandex) {
            case 0:
                Long l = (Long) obj;
                if (l != null) {
                    return Byte.valueOf((byte) l.longValue());
                }
                return null;
            case 1:
                Long l2 = (Long) obj;
                if (l2 != null) {
                    return Character.valueOf((char) l2.longValue());
                }
                return null;
            case 2:
                Long l3 = (Long) obj;
                if (l3 != null) {
                    return Integer.valueOf((int) l3.longValue());
                }
                return null;
            default:
                Long l4 = (Long) obj;
                if (l4 != null) {
                    return Short.valueOf((short) l4.longValue());
                }
                return null;
        }
    }

    @Override // defpackage.AbstractC14507l
    public final /* bridge */ /* synthetic */ Object yandex(Object obj) {
        switch (this.yandex) {
            case 0:
                Byte b = (Byte) obj;
                if (b != null) {
                    return Long.valueOf(b.byteValue());
                }
                return null;
            case 1:
                Character ch = (Character) obj;
                if (ch != null) {
                    return Long.valueOf(ch.charValue());
                }
                return null;
            case 2:
                Integer num = (Integer) obj;
                if (num != null) {
                    return Long.valueOf(num.intValue());
                }
                return null;
            default:
                Short sh = (Short) obj;
                if (sh != null) {
                    return Long.valueOf(sh.shortValue());
                }
                return null;
        }
    }
}
