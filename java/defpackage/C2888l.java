package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* JADX INFO: renamed from: lُؔۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2888l implements InterfaceC12202l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f6289l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f6290l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f6291l;

    public C2888l(C1424l c1424l, int i) {
        this.f6289l = new C15389l();
        this.f6290l = c1424l;
        C15718l.license();
        this.f6291l = i;
    }

    @Override // defpackage.InterfaceC12202l
    public void amazon(Object obj) {
        C4039l c4039l = (C4039l) this.f6290l;
        C18278l c18278l = (C18278l) this.f6289l;
        if (((Boolean) obj).booleanValue()) {
            C15010l c15010lVip = C18278l.vip(c18278l);
            String str = c4039l.amazon;
            c15010lVip.yandex();
            ((C18278l) c15010lVip.f3757l).adcel(str);
            c15010lVip.yandex();
            ((C18278l) c15010lVip.f3757l).ads(str);
            Long l = c4039l.purchase;
            if (l != null) {
                int iLongValue = (int) l.longValue();
                c15010lVip.yandex();
                ((C18278l) c15010lVip.f3757l).subscription(iLongValue);
            }
            C18278l c18278l2 = (C18278l) c15010lVip.loadAd();
            int i = c4039l.subs;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            int i3 = this.f6291l - 1;
            EnumC14251l enumC14251l = EnumC14251l.f27852l;
            C11658l c11658l = (i2 == 0 || i2 != 1) ? new C11658l(Integer.valueOf(i3), c18278l2, enumC14251l, null) : new C11658l(Integer.valueOf(i3), c18278l2, EnumC14251l.f27853l, null);
            C4039l.isPro.loadAd("analytics event: %s", c11658l);
            C11117l c11117l = c4039l.mopub;
            if (c11117l != null) {
                c11117l.yandex(c11658l, new C1759l(20));
            }
        }
    }

    public byte[] yandex(int i) {
        C13772l c13772l = C13772l.f26865l;
        C1424l c1424l = (C1424l) this.f6290l;
        ((C15389l) this.f6289l).subs = Boolean.valueOf(1 == (i ^ 1));
        C15389l c15389l = (C15389l) this.f6289l;
        c15389l.mopub = Boolean.FALSE;
        c1424l.f3603l = new C14867l(c15389l);
        try {
            C15718l.license();
            if (i == 0) {
                C9979l c9979l = new C9979l(c1424l);
                C9309l c9309l = new C9309l();
                c13772l.m3764while(c9309l);
                c9309l.f19122l = true;
                StringWriter stringWriter = new StringWriter();
                try {
                    C18403l c18403l = new C18403l(stringWriter, c9309l.f19121l, c9309l.f19120l, c9309l.f19119l, c9309l.f19122l);
                    c18403l.admob(c9979l);
                    c18403l.isPro();
                    c18403l.loadAd.flush();
                } catch (IOException unused) {
                }
                return stringWriter.toString().getBytes("utf-8");
            }
            C9979l c9979l2 = new C9979l(c1424l);
            C10111l c10111l = new C10111l(3);
            c13772l.m3764while(c10111l);
            HashMap map = new HashMap((HashMap) c10111l.f20587l);
            HashMap map2 = new HashMap((HashMap) c10111l.f20586l);
            C4267l c4267l = (C4267l) c10111l.f20589l;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                C6455l c6455l = new C6455l(byteArrayOutputStream, map, map2, c4267l);
                InterfaceC18528l interfaceC18528l = (InterfaceC18528l) map.get(C9979l.class);
                if (interfaceC18528l == null) {
                    throw new C4726l("No encoder for ".concat(String.valueOf(C9979l.class)));
                }
                interfaceC18528l.yandex(c9979l2, c6455l);
                return byteArrayOutputStream.toByteArray();
            } catch (IOException unused2) {
            }
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    public /* synthetic */ C2888l(C4039l c4039l, C18278l c18278l, int i) {
        this.f6290l = c4039l;
        this.f6289l = c18278l;
        this.f6291l = i;
    }
}
