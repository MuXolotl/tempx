package defpackage;

import android.view.View;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: lؔٙ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2717l implements Function4 {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final /* synthetic */ String f5887l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ String f5888l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C15764l f5889l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C5866l f5890l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2262l f5891l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ List f5892l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12244l f5893l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f5894l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ String f5895l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final /* synthetic */ boolean f5896l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ View f5897l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C5056l f5898l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f5899l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f5900l;

    public C2717l(List list, InterfaceC2262l interfaceC2262l, String str, String str2, Function1 function1, C5056l c5056l, C15764l c15764l, C5866l c5866l, View view, InterfaceC12244l interfaceC12244l, Function1 function2, boolean z, String str3, Function1 function3) {
        this.f5892l = list;
        this.f5891l = interfaceC2262l;
        this.f5888l = str;
        this.f5895l = str2;
        this.f5894l = function1;
        this.f5898l = c5056l;
        this.f5889l = c15764l;
        this.f5890l = c5866l;
        this.f5897l = view;
        this.f5893l = interfaceC12244l;
        this.f5899l = function2;
        this.f5896l = z;
        this.f5887l = str3;
        this.f5900l = function3;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        C7091l c7091l = (C7091l) obj;
        int iIntValue = ((Number) obj2).intValue();
        C6956l c6956l = (C6956l) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (c6956l.billing(c7091l) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= c6956l.amazon(iIntValue) ? 32 : 16;
        }
        if (c6956l.m2127for(i & 1, (i & 147) != 146)) {
            C10507l c10507l = (C10507l) this.f5892l.get(iIntValue);
            c6956l.m2123default(818383503);
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = AbstractC14814l.isPro(c6956l);
            }
            C2403l c2403l = (C2403l) objM2132native;
            c6956l.m2123default(1729504407);
            InterfaceC13490l interfaceC13490l = (InterfaceC13490l) c6956l.isPro(AbstractC4751l.admob);
            boolean zBilling = c6956l.billing(interfaceC13490l);
            Object objM2132native2 = c6956l.m2132native();
            if (zBilling || objM2132native2 == c13863l) {
                objM2132native2 = new C11037l(interfaceC13490l, 0);
                c6956l.m2147try(objM2132native2);
            }
            Function1 function1 = (Function1) objM2132native2;
            c6956l.startapp(false);
            Object[] objArr = new Object[0];
            C13645l c13645l = new C13645l(new C14813l((byte) 0, 9), new C0786l(12, function1), 13);
            boolean zAmazon = c6956l.amazon(2) | c6956l.billing(function1);
            Object objM2132native3 = c6956l.m2132native();
            if (zAmazon || objM2132native3 == c13863l) {
                objM2132native3 = new C8652l(EnumC16440l.f32143l, function1, 28);
                c6956l.m2147try(objM2132native3);
            }
            C12324l c12324l = (C12324l) AbstractC0825l.smaato(objArr, c13645l, (Function0) objM2132native3, c6956l, 0);
            boolean zAdmob = c6956l.admob(c12324l) | c6956l.admob(this.f5891l) | c6956l.billing(c10507l) | c6956l.billing(this.f5888l) | c6956l.billing(this.f5895l) | c6956l.billing(this.f5894l);
            Object objM2132native4 = c6956l.m2132native();
            if (zAdmob || objM2132native4 == c13863l) {
                C13067l c13067l = new C13067l(c12324l, this.f5891l, this.f5889l, this.f5888l, this.f5895l, this.f5894l, c10507l, (InterfaceC14029l) null);
                c6956l.m2147try(c13067l);
                objM2132native4 = c13067l;
            }
            AbstractC12311l.purchase(c10507l, c12324l, (Function2) objM2132native4, c6956l);
            AbstractC12953l.admob(c7091l, this.f5898l, c10507l.yandex, null, false, null, AbstractC14566l.amazon(-504512203, new C15910l(c12324l, this.f5890l, c2403l, this.f5897l, this.f5893l, this.f5899l, c10507l, this.f5896l, this.f5887l, this.f5900l), c6956l), c6956l, (i & 14) | 1572864, 28);
            c6956l.startapp(false);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }
}
