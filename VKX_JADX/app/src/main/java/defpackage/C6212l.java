package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lؙؓٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C6212l extends C2453l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public ArrayList f13129l;

    @Override // defpackage.C2453l, defpackage.AbstractC5550l
    public final EnumC11981l crashlytics() {
        return EnumC11981l.IMPLICIT;
    }

    @Override // defpackage.C2453l, defpackage.AbstractC5550l
    public final byte[] loadAd() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Iterator it = this.f13129l.iterator();
        while (it.hasNext()) {
            try {
                short sShortValue = ((Short) it.next()).shortValue();
                C13975l c13975l = AbstractC14375l.yandex;
                byteArrayOutputStream.write(new byte[]{(byte) ((sShortValue >> 8) & 255), (byte) (sShortValue & 255)});
            } catch (IOException e) {
                C11467l.metrica(e);
                return null;
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // defpackage.C2453l, defpackage.AbstractC5550l
    public void yandex(ByteBuffer byteBuffer) {
        C9993l c9993l = new C9993l(new C8117l(byteBuffer), byteBuffer);
        this.f5241l = c9993l.f20393l;
        this.f13129l = c9993l.f20392l;
    }
}
