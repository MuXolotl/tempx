package defpackage;

import java.nio.charset.Charset;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function5;

/* JADX INFO: renamed from: lؘؑۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0144l extends AbstractC5563l implements Function5 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ InterfaceC9354l f1044l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public /* synthetic */ C11310l f1045l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ List f1046l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f1047l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ Set f1048l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ AbstractC10022l f1049l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ C12825l f1050l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0144l(C12825l c12825l, InterfaceC14029l interfaceC14029l, List list, Set set) {
        super(5, interfaceC14029l);
        this.f1048l = set;
        this.f1046l = list;
        this.f1050l = c12825l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws C10756l {
        C5254l c5254lAdmob;
        AbstractC10022l abstractC10022l = this.f1049l;
        InterfaceC9354l interfaceC9354l = this.f1044l;
        C11310l c11310l = this.f1045l;
        int i = this.f1047l;
        if (i != 0) {
            if (i == 1) {
                AbstractC2829l.crashlytics(obj);
                return obj;
            }
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC2829l.crashlytics(obj);
        String strSignatures = abstractC10022l.yandex().signatures("Content-Type");
        if (strSignatures != null) {
            C5254l c5254l = C5254l.f11335l;
            c5254lAdmob = AbstractC10033l.admob(strSignatures);
        } else {
            c5254lAdmob = null;
        }
        if (c5254lAdmob == null) {
            return null;
        }
        Charset charsetYandex = AbstractC15755l.yandex(c5254lAdmob);
        if (charsetYandex == null) {
            charsetYandex = AbstractC9050l.yandex;
        }
        Charset charset = charsetYandex;
        C2540l url = AbstractC3474l.mopub(abstractC10022l).getUrl();
        this.f1049l = null;
        this.f1044l = null;
        this.f1045l = null;
        this.f1047l = 1;
        Object objLoadAd = AbstractC18358l.loadAd(this.f1048l, this.f1046l, url, c11310l, interfaceC9354l, c5254lAdmob, charset, this);
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        return objLoadAd == enumC9342l ? enumC9342l : objLoadAd;
    }

    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        List list = this.f1046l;
        C0144l c0144l = new C0144l(this.f1050l, (InterfaceC14029l) obj5, list, this.f1048l);
        c0144l.f1049l = (AbstractC10022l) obj2;
        c0144l.f1044l = (InterfaceC9354l) obj3;
        c0144l.f1045l = (C11310l) obj4;
        return c0144l.Signature(Unit.INSTANCE);
    }
}
