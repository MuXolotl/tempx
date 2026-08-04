package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.catalogkit.objects.Catalog2Response;

/* JADX INFO: renamed from: lًْٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8111l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC9694l f16902l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Catalog2Response f16903l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f16904l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f16905l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8111l(AbstractC9694l abstractC9694l, Catalog2Response catalog2Response, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f16904l = i;
        this.f16902l = abstractC9694l;
        this.f16903l = catalog2Response;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f16904l;
        Catalog2Response catalog2Response = this.f16903l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        AbstractC9694l abstractC9694l = this.f16902l;
        switch (i) {
            case 0:
                int i2 = this.f16905l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    abstractC9694l.mo1271super();
                    List listSingletonList = Collections.singletonList(catalog2Response);
                    this.f16905l = 1;
                    if (AbstractC9694l.m2717l(abstractC9694l, listSingletonList, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i2 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            default:
                int i3 = this.f16905l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    abstractC9694l.mo1271super();
                    List listSingletonList2 = Collections.singletonList(catalog2Response);
                    this.f16905l = 1;
                    if (AbstractC9694l.m2717l(abstractC9694l, listSingletonList2, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i3 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f16904l;
        Catalog2Response catalog2Response = this.f16903l;
        AbstractC9694l abstractC9694l = this.f16902l;
        switch (i) {
            case 0:
                return new C8111l(abstractC9694l, catalog2Response, interfaceC14029l, 0);
            default:
                return new C8111l(abstractC9694l, catalog2Response, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f16904l) {
            case 0:
                break;
        }
        return ((C8111l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
