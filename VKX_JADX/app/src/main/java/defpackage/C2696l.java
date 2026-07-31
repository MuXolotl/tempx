package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/* JADX INFO: renamed from: lؔ٘ۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2696l extends AbstractC17054l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final HashMap f5826l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C1461l f5827l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2696l(InputStream inputStream) {
        super(inputStream);
        EnumC6690l enumC6690l = EnumC6690l.f14038l;
        C1461l c1461l = C1461l.f3665l;
        this.f5826l = new HashMap();
        this.f5827l = c1461l;
        InterfaceC7233l[] interfaceC7233lArr = {C7263l.loadAd, C7263l.crashlytics, C7263l.amazon, C16289l.purchase, C16289l.billing, C16289l.smaato, C16289l.mopub, C16289l.admob, C16289l.amazon, C14028l.crashlytics, C16289l.subs, C14028l.purchase, C14028l.amazon, C16289l.isPro, C16289l.crashlytics, C16289l.firebase, C16289l.remoteconfig, C16289l.vip};
        for (int i = 0; i < 18; i++) {
            InterfaceC7233l interfaceC7233l = interfaceC7233lArr[i];
            this.f5826l.put(interfaceC7233l.loadAd(), interfaceC7233l);
        }
    }

    @Override // defpackage.InterfaceC15177l
    /* JADX INFO: renamed from: l٘ۦۢ, reason: contains not printable characters */
    public final C2434l mo1235l() throws C2584l, C10756l, EOFException {
        C1461l c1461l;
        C1298l c1298l = (C1298l) this.f33215l;
        if (!((Scanner) c1298l.f3346l).hasNext()) {
            C8339l.vip();
            return null;
        }
        EnumC6690l enumC6690l = (EnumC6690l) this.f33214l;
        C6344l c6344l = new C6344l();
        c6344l.f13308l = new ArrayList();
        int i = -1;
        c6344l.f13305l = -1;
        c6344l.f13303l = enumC6690l;
        while (true) {
            try {
                boolean zHasNext = ((Scanner) c1298l.f3346l).hasNext();
                c1461l = this.f5827l;
                if (!zHasNext) {
                    break;
                }
                String strPurchase = c1298l.purchase();
                boolean z = true;
                if (!(strPurchase.startsWith("#") && !strPurchase.startsWith("#EXT")) && strPurchase.length() != strPurchase.trim().length()) {
                    throw C2584l.yandex(strPurchase, 39, null);
                }
                if (strPurchase.length() != 0) {
                    if (!(strPurchase.startsWith("#") && !strPurchase.startsWith("#EXT"))) {
                        if (strPurchase.startsWith("#EXT")) {
                            int iIndexOf = strPurchase.indexOf(":");
                            String strSubstring = iIndexOf == i ? strPurchase.substring(1) : strPurchase.substring(1, iIndexOf);
                            InterfaceC7233l interfaceC7233l = (InterfaceC7233l) this.f5826l.get(strSubstring);
                            if (interfaceC7233l == null) {
                                c1461l.getClass();
                                throw C2584l.yandex(strSubstring, 38, strPurchase);
                            }
                            interfaceC7233l.crashlytics(strPurchase, c6344l);
                            C3930l c3930l = (C3930l) c6344l.f13309l;
                            if ((c3930l != null) && c3930l.f8102l) {
                                break;
                            }
                        } else {
                            C5390l c5390l = (C5390l) c6344l.f13307l;
                            if (c5390l != null) {
                                c5390l.f11542l.add(new C4246l(strPurchase, (C12431l) c5390l.f11540l));
                                c5390l.f11540l = null;
                            } else {
                                C3930l c3930l2 = (C3930l) c6344l.f13309l;
                                if (c3930l2 == null) {
                                    z = false;
                                }
                                if (!z) {
                                    throw C2584l.yandex(strPurchase, 36, null);
                                }
                                if (c6344l.f13306l && c3930l2.f8093l == null) {
                                    throw C2584l.yandex(strPurchase, 28, null);
                                }
                                c3930l2.f8091l.add(new C0657l(strPurchase, c3930l2.f8093l, c3930l2.f8100l, c3930l2.f8096l, c3930l2.f8099l, c3930l2.f8090l, c3930l2.f8103l));
                                c3930l2.f8093l = null;
                                c3930l2.f8096l = null;
                                c3930l2.f8099l = false;
                                c3930l2.f8090l = null;
                                c3930l2.f8103l = null;
                            }
                        }
                        i = -1;
                    }
                }
            } catch (C2584l e) {
                Object obj = c1298l.f3349l;
                throw e;
            }
        }
        C2434l c2434lAmazon = c6344l.amazon();
        if (((Set) C5008l.premium(c2434lAmazon, c1461l).f10245l).isEmpty()) {
            return c2434lAmazon;
        }
        throw new C10756l(10);
    }
}
