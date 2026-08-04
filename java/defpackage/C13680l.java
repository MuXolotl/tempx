package defpackage;

import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lْۜ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13680l extends AbstractC5563l implements Function3 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ String f26715l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Charset f26716l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public /* synthetic */ C6806l f26717l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f26718l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13680l(String str, Charset charset, InterfaceC14029l interfaceC14029l) {
        super(3, interfaceC14029l);
        this.f26715l = str;
        this.f26716l = charset;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        C5254l c5254lAmazon;
        Charset charsetYandex;
        C6806l c6806l = this.f26717l;
        Object obj2 = this.f26718l;
        AbstractC2829l.crashlytics(obj);
        InterfaceC6272l interfaceC6272l = AbstractC14083l.yandex;
        String str = this.f26715l;
        if (str != null && c6806l.crashlytics.m217l("Accept-Charset") == null) {
            InterfaceC6272l interfaceC6272l2 = AbstractC14083l.yandex;
            StringBuilder sbIsVip = AbstractC5020l.isVip("Adding Accept-Charset=", str, " to ");
            sbIsVip.append(c6806l.yandex);
            interfaceC6272l2.vip(sbIsVip.toString());
            c6806l.crashlytics.m223l("Accept-Charset", str);
        }
        if (!(obj2 instanceof String) || ((c5254lAmazon = AbstractC11036l.amazon(c6806l)) != null && !AbstractC8576l.yandex(c5254lAmazon.f11337l, AbstractC2460l.loadAd.f11337l))) {
            return null;
        }
        String str2 = (String) obj2;
        C5254l c5254l = c5254lAmazon == null ? AbstractC2460l.loadAd : c5254lAmazon;
        if (c5254lAmazon == null || (charsetYandex = AbstractC15755l.yandex(c5254lAmazon)) == null) {
            charsetYandex = this.f26716l;
        }
        AbstractC14083l.yandex.vip("Sending request body to " + c6806l.yandex + " as text/plain with charset " + charsetYandex);
        int i = AbstractC15755l.yandex;
        return new C2627l(str2, c5254l.m1756l(charsetYandex.name()), null);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C13680l c13680l = new C13680l(this.f26715l, this.f26716l, (InterfaceC14029l) obj3);
        c13680l.f26717l = (C6806l) obj;
        c13680l.f26718l = obj2;
        return c13680l.Signature(Unit.INSTANCE);
    }
}
