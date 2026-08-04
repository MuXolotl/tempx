package defpackage;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* JADX INFO: renamed from: lَؘۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10122l implements InterfaceC2790l {
    public final C4434l loadAd;
    public final C13252l yandex;

    public C10122l(Context context, C4434l c4434l) {
        this.loadAd = c4434l;
        C16529l c16529l = C16529l.purchase;
        C4225l.loadAd(context);
        C16930l c16930lCrashlytics = C4225l.yandex().crashlytics(c16529l);
        if (C16529l.amazon.contains(new C7017l("json"))) {
            new C13252l(new C16366l(c16930lCrashlytics, 0));
        }
        this.yandex = new C13252l(new C16366l(c16930lCrashlytics, 1));
    }

    @Override // defpackage.InterfaceC2790l
    public final void yandex(C7847l c7847l) {
        C11117l c11117l = (C11117l) this.yandex.get();
        C18450l c18450l = C18450l.f36013l;
        C4816l c4816l = (C4816l) c7847l.f16370l;
        ((C15389l) c7847l.f16369l).subs = false;
        C15389l c15389l = (C15389l) c7847l.f16369l;
        c15389l.mopub = Boolean.FALSE;
        c4816l.f9860l = new C2681l(c15389l);
        try {
            C8565l.isVip();
            C1032l c1032l = new C1032l(c4816l);
            C12418l c12418l = new C12418l(14);
            c18450l.purchase(c12418l);
            HashMap map = new HashMap((HashMap) c12418l.f24519l);
            HashMap map2 = new HashMap((HashMap) c12418l.f24518l);
            C4267l c4267l = (C4267l) c12418l.f24521l;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                C4318l c4318l = new C4318l(byteArrayOutputStream, map, map2, c4267l);
                InterfaceC18528l interfaceC18528l = (InterfaceC18528l) map.get(C1032l.class);
                if (interfaceC18528l == null) {
                    throw new C4726l("No encoder for ".concat(String.valueOf(C1032l.class)));
                }
                interfaceC18528l.yandex(c1032l, c4318l);
                c11117l.yandex(new C11658l(null, byteArrayOutputStream.toByteArray(), EnumC14251l.f27852l, null), new C1759l(20));
            } catch (IOException unused) {
            }
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
