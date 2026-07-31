package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: renamed from: lَؙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10124l extends C6212l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C13975l f20632l;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        f20632l = new C13975l(4);
    }

    public C10124l(String str) {
        super(EnumC16541l.GENRE.f32477l, str);
        try {
            short s = Short.parseShort(str);
            if (s <= 125) {
                ArrayList arrayList = new ArrayList();
                this.f13129l = arrayList;
                arrayList.add(Short.valueOf((short) (s + 1)));
            } else {
                ArrayList arrayList2 = new ArrayList();
                this.f13129l = arrayList2;
                arrayList2.add((short) 1);
            }
        } catch (NumberFormatException unused) {
            Integer numAdcel = C18595l.ads().adcel(str);
            if (numAdcel == null || numAdcel.intValue() > 125) {
                ArrayList arrayList3 = new ArrayList();
                this.f13129l = arrayList3;
                arrayList3.add((short) 1);
            } else {
                ArrayList arrayList4 = new ArrayList();
                this.f13129l = arrayList4;
                arrayList4.add(Short.valueOf((short) (numAdcel.intValue() + 1)));
            }
        }
    }

    @Override // defpackage.C6212l, defpackage.C2453l, defpackage.AbstractC5550l
    public final void yandex(ByteBuffer byteBuffer) {
        ArrayList arrayList = new C9993l(new C8117l(byteBuffer), byteBuffer).f20392l;
        this.f13129l = arrayList;
        if (arrayList.size() > 0) {
            this.f5241l = C18595l.ads().getValue(((Short) this.f13129l.get(0)).shortValue() - 1);
        } else {
            EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
            f20632l.getClass();
            int i = C17500l.yandex;
        }
    }
}
