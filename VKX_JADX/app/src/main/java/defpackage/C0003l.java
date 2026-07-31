package defpackage;

import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.jvm.functions.Function5;

/* JADX INFO: renamed from: lِؑؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0003l extends AbstractC5563l implements Function5 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ InterfaceC9354l f853l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public /* synthetic */ C11310l f854l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f855l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ Charset f856l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ AbstractC10022l f857l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0003l(Charset charset, InterfaceC14029l interfaceC14029l) {
        super(5, interfaceC14029l);
        this.f856l = charset;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Throwable {
        C5254l c5254lAdmob;
        AbstractC10022l abstractC10022l = this.f857l;
        InterfaceC9354l interfaceC9354l = this.f853l;
        C11310l c11310l = this.f854l;
        int i = this.f855l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            if (!AbstractC8576l.yandex(c11310l.yandex, AbstractC18202l.yandex.loadAd(String.class))) {
                return null;
            }
            this.f857l = abstractC10022l;
            this.f853l = null;
            this.f854l = null;
            this.f855l = 1;
            obj = AbstractC10310l.premium(interfaceC9354l, this);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (obj == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
        }
        InterfaceC14189l interfaceC14189l = (InterfaceC14189l) obj;
        C14249l c14249lLoadAd = abstractC10022l.loadAd();
        InterfaceC6272l interfaceC6272l = AbstractC14083l.yandex;
        AbstractC10022l abstractC10022l2 = c14249lLoadAd.f27845l;
        if (abstractC10022l2 == null) {
            abstractC10022l2 = null;
        }
        String strSignatures = abstractC10022l2.yandex().signatures("Content-Type");
        if (strSignatures != null) {
            C5254l c5254l = C5254l.f11335l;
            c5254lAdmob = AbstractC10033l.admob(strSignatures);
        } else {
            c5254lAdmob = null;
        }
        Charset charsetYandex = c5254lAdmob != null ? AbstractC15755l.yandex(c5254lAdmob) : null;
        if (charsetYandex == null) {
            charsetYandex = this.f856l;
        }
        InterfaceC6272l interfaceC6272l2 = AbstractC14083l.yandex;
        StringBuilder sb = new StringBuilder("Reading response body for ");
        InterfaceC1814l interfaceC1814l = c14249lLoadAd.f27846l;
        sb.append((interfaceC1814l != null ? interfaceC1814l : null).getUrl());
        sb.append(" as String with charset ");
        sb.append(charsetYandex);
        interfaceC6272l2.vip(sb.toString());
        return C17423l.firebase(interfaceC14189l, charsetYandex, 2);
    }

    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        C0003l c0003l = new C0003l(this.f856l, (InterfaceC14029l) obj5);
        c0003l.f857l = (AbstractC10022l) obj2;
        c0003l.f853l = (InterfaceC9354l) obj3;
        c0003l.f854l = (C11310l) obj4;
        return c0003l.Signature(Unit.INSTANCE);
    }
}
