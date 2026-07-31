package org.bouncycastle.jcajce.provider.asymmetric.util;

import defpackage.AbstractC14024l;
import defpackage.AbstractC5290l;
import defpackage.AbstractC9361l;
import defpackage.C0045l;
import defpackage.C10198l;
import defpackage.C12333l;
import defpackage.C15671l;
import defpackage.C17219l;
import defpackage.C17711l;
import defpackage.C17951l;
import defpackage.C2313l;
import defpackage.C2657l;
import defpackage.C5153l;
import defpackage.C8339l;
import defpackage.C9800l;
import defpackage.Cfor;
import defpackage.Cthrow;
import defpackage.InterfaceC0543l;
import defpackage.InterfaceC15427l;
import defpackage.InterfaceC16922l;
import defpackage.InterfaceC8134l;
import defpackage.applovin;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public class KdfUtil {
    public static InterfaceC16922l getDigest(Cfor cfor) {
        if (cfor.ad(InterfaceC8134l.yandex)) {
            return new C2657l();
        }
        if (cfor.ad(InterfaceC8134l.crashlytics)) {
            return new C17711l();
        }
        if (cfor.ad(InterfaceC8134l.firebase)) {
            return new C17951l(128);
        }
        if (cfor.ad(InterfaceC8134l.smaato)) {
            return new C17951l(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
        C8339l.metrica(AbstractC9361l.license("unrecognized digest OID: ", cfor));
        return null;
    }

    public static byte[] makeKeyBytes(C10198l c10198l, byte[] bArr, byte[] bArr2, int i) {
        int i2 = (i + 7) / 8;
        byte[] bArr3 = new byte[i2];
        if (c10198l == null) {
            System.arraycopy(bArr, 0, bArr3, 0, i2);
            return bArr3;
        }
        applovin applovinVar = c10198l.f20786l;
        Cfor cfor = c10198l.f20787l;
        if (InterfaceC15427l.f30164l.ad(cfor)) {
            C0045l c0045l = new C0045l(getDigest(C10198l.vip(applovinVar).f20787l));
            c0045l.billing(new C9800l(bArr, bArr2));
            c0045l.purchase(i2, bArr3);
            return bArr3;
        }
        if (InterfaceC15427l.f30178l.ad(cfor)) {
            C17219l c17219l = new C17219l(getDigest(C10198l.vip(applovinVar).f20787l));
            c17219l.billing(new C9800l(bArr, bArr2));
            c17219l.purchase(i2, bArr3);
            return bArr3;
        }
        if (InterfaceC0543l.f1904l.ad(cfor)) {
            if (applovinVar != null) {
                C8339l.smaato("HDKF parameter support not added");
                return null;
            }
            C2313l c2313l = new C2313l(new C2657l());
            c2313l.billing(new C12333l(bArr, null, bArr2));
            c2313l.purchase(i2, bArr3);
            return bArr3;
        }
        if (InterfaceC0543l.f1894l.ad(cfor)) {
            if (applovinVar != null) {
                C8339l.smaato("HDKF parameter support not added");
                return null;
            }
            C2313l c2313l2 = new C2313l(new C5153l());
            c2313l2.billing(new C12333l(bArr, null, bArr2));
            c2313l2.purchase(i2, bArr3);
            return bArr3;
        }
        if (InterfaceC0543l.f1886l.ad(cfor)) {
            if (applovinVar != null) {
                C8339l.smaato("HDKF parameter support not added");
                return null;
            }
            C2313l c2313l3 = new C2313l(new C17711l());
            c2313l3.billing(new C12333l(bArr, null, bArr2));
            c2313l3.purchase(i2, bArr3);
            return bArr3;
        }
        if (InterfaceC8134l.tapsense.ad(cfor)) {
            byte[] bArr4 = new byte[0];
            if (applovinVar != null) {
                bArr4 = Cthrow.premium(applovinVar).f36593l;
            }
            C15671l c15671l = new C15671l(128, bArr4);
            int length = bArr.length;
            byte[] bArr5 = new byte[length];
            System.arraycopy(bArr, 0, bArr5, 0, length);
            byte[] bArrCrashlytics = AbstractC14024l.crashlytics(bArr5);
            c15671l.f30643l = bArrCrashlytics;
            if (bArrCrashlytics.length > 255) {
                C8339l.metrica("key length must be between 0 and 2040 bits");
                return null;
            }
            c15671l.f30642l = true;
            c15671l.reset();
            c15671l.update(bArr2, 0, bArr2.length);
            c15671l.crashlytics(0, i2, bArr3);
            return bArr3;
        }
        if (!InterfaceC8134l.Signature.ad(cfor)) {
            if (!InterfaceC8134l.smaato.ad(cfor)) {
                C8339l.metrica(AbstractC9361l.license("Unrecognized KDF: ", cfor));
                return null;
            }
            C17951l c17951l = new C17951l(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
            c17951l.billing(0, bArr.length, bArr);
            c17951l.billing(0, bArr2.length, bArr2);
            c17951l.crashlytics(0, i2, bArr3);
            return bArr3;
        }
        byte[] bArr6 = new byte[0];
        if (applovinVar != null) {
            bArr6 = Cthrow.premium(applovinVar).f36593l;
        }
        C15671l c15671l2 = new C15671l(PSKKeyManager.MAX_KEY_LENGTH_BYTES, bArr6);
        int length2 = bArr.length;
        byte[] bArr7 = new byte[length2];
        System.arraycopy(bArr, 0, bArr7, 0, length2);
        byte[] bArrCrashlytics2 = AbstractC14024l.crashlytics(bArr7);
        c15671l2.f30643l = bArrCrashlytics2;
        if (bArrCrashlytics2.length > 255) {
            C8339l.metrica("key length must be between 0 and 2040 bits");
            return null;
        }
        c15671l2.f30642l = true;
        c15671l2.reset();
        c15671l2.update(bArr2, 0, bArr2.length);
        c15671l2.crashlytics(0, i2, bArr3);
        return bArr3;
    }

    public static byte[] makeKeyBytes(AbstractC5290l abstractC5290l, byte[] bArr) {
        byte[] bArrMakeKeyBytes;
        try {
            if (abstractC5290l == null) {
                int length = bArr.length;
                bArrMakeKeyBytes = new byte[length];
                System.arraycopy(bArr, 0, bArrMakeKeyBytes, 0, length);
            } else {
                bArrMakeKeyBytes = makeKeyBytes(abstractC5290l.f11406l, bArr, AbstractC14024l.crashlytics(abstractC5290l.f11405l), PSKKeyManager.MAX_KEY_LENGTH_BYTES);
            }
            AbstractC14024l.loadAd(bArr);
            return bArrMakeKeyBytes;
        } catch (Throwable th) {
            AbstractC14024l.loadAd(bArr);
            throw th;
        }
    }
}
