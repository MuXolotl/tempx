package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: renamed from: lٖٞؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16530l extends C6212l {
    public C16530l(int i) {
        super(EnumC16541l.TRACK.f32477l, String.valueOf(i));
        ArrayList arrayList = new ArrayList();
        this.f13129l = arrayList;
        arrayList.add(new Short("0"));
        this.f13129l.add(Short.valueOf((short) i));
        this.f13129l.add(new Short("0"));
        this.f13129l.add(new Short("0"));
    }

    public final Short purchase() {
        if (this.f13129l.size() <= 2) {
            return (short) 0;
        }
        return (Short) this.f13129l.get(2);
    }

    @Override // defpackage.C6212l, defpackage.C2453l, defpackage.AbstractC5550l
    public final void yandex(ByteBuffer byteBuffer) {
        this.f13129l = new C9993l(new C8117l(byteBuffer), byteBuffer).f20392l;
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.f13129l;
        if (arrayList != null) {
            if (arrayList.size() > 1 && ((Short) this.f13129l.get(1)).shortValue() > 0) {
                sb.append(this.f13129l.get(1));
            }
            if (this.f13129l.size() > 2 && ((Short) this.f13129l.get(2)).shortValue() > 0) {
                sb.append("/");
                sb.append(this.f13129l.get(2));
            }
        }
        this.f5241l = sb.toString();
    }

    public C16530l(int i, int i2) {
        super(EnumC16541l.TRACK.f32477l, String.valueOf(i));
        ArrayList arrayList = new ArrayList();
        this.f13129l = arrayList;
        arrayList.add(new Short("0"));
        this.f13129l.add(Short.valueOf((short) i));
        this.f13129l.add(Short.valueOf((short) i2));
        this.f13129l.add(new Short("0"));
    }
}
