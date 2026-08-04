package defpackage;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.HashMap;

/* JADX INFO: renamed from: lًٌۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7881l extends AbstractC17054l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object f16434l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f16435l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Object f16436l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7881l(ByteBuffer byteBuffer, C16528l c16528l, int i) {
        super(byteBuffer, c16528l, 7);
        this.f16435l = i;
    }

    @Override // defpackage.AbstractC17054l
    /* JADX INFO: renamed from: lؖٔؓ */
    public final boolean mo1010l() {
        EnumC1375l enumC1375l;
        EnumC17969l enumC17969l;
        boolean z = false;
        switch (this.f16435l) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) this.f33214l;
                short s = byteBuffer.getShort();
                C13975l c13975l = AbstractC14375l.yandex;
                int i = s & 65535;
                Integer numValueOf = Integer.valueOf(i);
                HashMap map = EnumC10061l.f20526l;
                this.f16434l = (EnumC10061l) map.get(numValueOf);
                C16492l c16492l = (C16492l) this.f16436l;
                c16492l.purchase = byteBuffer.getShort() & 65535;
                c16492l.billing = byteBuffer.getInt();
                int i2 = byteBuffer.getInt();
                c16492l.remoteconfig = i2;
                c16492l.amazon = (i2 * 8) / 1000;
                c16492l.subs = false;
                byteBuffer.getShort();
                c16492l.mopub = byteBuffer.getShort() & 65535;
                EnumC10061l enumC10061l = (EnumC10061l) this.f16434l;
                if (enumC10061l != null && enumC10061l == EnumC10061l.f20524l && (byteBuffer.getShort() & 65535) == 22) {
                    c16492l.mopub = byteBuffer.getShort() & 65535;
                    byteBuffer.getInt();
                    this.f16434l = (EnumC10061l) map.get(Integer.valueOf(byteBuffer.getShort() & 65535));
                }
                EnumC10061l enumC10061l2 = (EnumC10061l) this.f16434l;
                if (enumC10061l2 == null) {
                    c16492l.admob = "Unknown Sub Format Code:".concat(AbstractC6419l.mopub(i));
                } else if (c16492l.mopub > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(((EnumC10061l) this.f16434l).f20527l);
                    sb.append(" ");
                    c16492l.admob = AbstractC14814l.remoteconfig(c16492l.mopub, " bits", sb);
                } else {
                    c16492l.admob = enumC10061l2.f20527l;
                }
                return true;
            default:
                String strIsPro = AbstractC14375l.isPro((ByteBuffer) this.f33214l);
                HashMap map2 = EnumC2086l.f4674l;
                if (strIsPro.equals("INFO")) {
                    C7313l c7313l = (C7313l) this.f16434l;
                    C12228l c12228l = new C12228l();
                    C5368l c5368l = new C5368l();
                    c12228l.yandex = c5368l;
                    c7313l.f15164l = c5368l;
                    ByteBuffer byteBuffer2 = (ByteBuffer) this.f33214l;
                    while (byteBuffer2.remaining() >= AbstractC11306l.amazon) {
                        String strIsPro2 = AbstractC14375l.isPro(byteBuffer2);
                        if (strIsPro2.trim().isEmpty()) {
                            z = true;
                        } else {
                            int i3 = byteBuffer2.getInt();
                            if (Character.isAlphabetic(strIsPro2.charAt(0)) && Character.isAlphabetic(strIsPro2.charAt(1)) && Character.isAlphabetic(strIsPro2.charAt(2)) && Character.isAlphabetic(strIsPro2.charAt(3))) {
                                try {
                                    String strMopub = AbstractC14375l.mopub(byteBuffer2, 0, i3, AbstractC12379l.crashlytics);
                                    C13975l c13975l2 = C12228l.loadAd;
                                    EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
                                    c13975l2.getClass();
                                    int i4 = C17500l.yandex;
                                    EnumC1375l enumC1375l2 = EnumC1375l.TRACKNO;
                                    synchronized (EnumC1375l.class) {
                                        try {
                                            if (EnumC1375l.f3500l.isEmpty()) {
                                                for (EnumC1375l enumC1375l3 : EnumC1375l.values()) {
                                                    EnumC1375l.f3500l.put(enumC1375l3.f3505l, enumC1375l3);
                                                }
                                            }
                                            enumC1375l = (EnumC1375l) EnumC1375l.f3500l.get(strIsPro2);
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    if (enumC1375l != null && (enumC17969l = enumC1375l.f3504l) != null) {
                                        try {
                                            c12228l.yandex.firebase(enumC17969l, strMopub);
                                        } catch (C9706l e) {
                                            C13975l c13975l3 = C12228l.loadAd;
                                            EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
                                            e.getMessage();
                                            c13975l3.getClass();
                                            int i5 = C17500l.yandex;
                                        }
                                    } else if (!strIsPro2.trim().isEmpty()) {
                                        c12228l.yandex.f11508l.add(new C7932l(strIsPro2, strMopub));
                                    }
                                    if (AbstractC14375l.admob(i3) && byteBuffer2.hasRemaining()) {
                                        byteBuffer2.get();
                                    }
                                } catch (BufferUnderflowException e2) {
                                    C13975l c13975l4 = C12228l.loadAd;
                                    EnumC8711l[] enumC8711lArr3 = EnumC8711l.f17925l;
                                    e2.getMessage();
                                    c13975l4.getClass();
                                    int i6 = C17500l.yandex;
                                }
                            } else {
                                C13975l c13975l5 = C12228l.loadAd;
                                EnumC8711l[] enumC8711lArr4 = EnumC8711l.f17925l;
                                c13975l5.getClass();
                                int i7 = C17500l.yandex;
                            }
                        }
                        ((C7313l) this.f16434l).f15164l.f11506l = Long.valueOf(((C16528l) this.f33215l).f32306l);
                        C5368l c5368l2 = ((C7313l) this.f16434l).f15164l;
                        C16528l c16528l = (C16528l) this.f33215l;
                        c5368l2.f11507l = Long.valueOf(c16528l.f32306l + 8 + c16528l.f32303l);
                        ((C7313l) this.f16434l).f15165l = true;
                        break;
                    }
                    z = true;
                    ((C7313l) this.f16434l).f15164l.f11506l = Long.valueOf(((C16528l) this.f33215l).f32306l);
                    C5368l c5368l3 = ((C7313l) this.f16434l).f15164l;
                    C16528l c16528l2 = (C16528l) this.f33215l;
                    c5368l3.f11507l = Long.valueOf(c16528l2.f32306l + 8 + c16528l2.f32303l);
                    ((C7313l) this.f16434l).f15165l = true;
                }
                return z;
        }
    }

    @Override // defpackage.AbstractC17054l
    public final String toString() {
        switch (this.f16435l) {
        }
        return "RIFF-WAVE Header:\nIs valid?: false";
    }
}
