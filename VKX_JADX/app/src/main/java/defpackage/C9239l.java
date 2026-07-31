package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٍَؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9239l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ Object f18990l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Object f18991l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f18992l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ boolean f18993l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9239l(boolean z, C5056l c5056l, Object obj, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f18992l = 1;
        this.f18993l = z;
        this.f18991l = c5056l;
        this.f18990l = obj;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f18992l;
        boolean z = this.f18993l;
        Object obj2 = this.f18991l;
        Object obj3 = this.f18990l;
        switch (i) {
            case 0:
                C16811l c16811l = (C16811l) obj3;
                AbstractC2829l.crashlytics(obj);
                C16076l c16076l = (C16076l) obj2;
                C2427l c2427l = (C2427l) c16076l.admob(new C18606l(c16076l, 14));
                String str = c2427l != null ? c2427l.yandex : null;
                C1673l c1673l = new C1673l(z);
                c16811l.m4198l();
                AbstractC12442l.metrica(str, "mediaId must not be null");
                AbstractC12442l.subs(!TextUtils.isEmpty(str), "mediaId must not be empty");
                InterfaceC11345l interfaceC11345l = c16811l.f32834l;
                if (interfaceC11345l.mo319l()) {
                    interfaceC11345l.mo316l(str, c1673l);
                } else {
                    AbstractC7151l.purchase(new C5159l(-100));
                }
                return Unit.INSTANCE;
            case 1:
                AbstractC2829l.crashlytics(obj);
                C5056l c5056l = (C5056l) obj2;
                if (z) {
                    c5056l.ads.add(obj3);
                } else {
                    c5056l.ads.remove(obj3);
                }
                return Unit.INSTANCE;
            default:
                C7814l c7814l = (C7814l) obj3;
                AbstractC2829l.crashlytics(obj);
                List<C18233l> list = c7814l.f16331l;
                EnumC14435l enumC14435l = (EnumC14435l) obj2;
                ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
                for (C18233l c18233l : list) {
                    EnumC14435l enumC14435l2 = c18233l.f35744l;
                    if (enumC14435l2 == enumC14435l) {
                        c18233l = new C18233l(enumC14435l2, z, c18233l.yandex());
                    }
                    arrayList.add(c18233l);
                }
                return C7814l.loadAd(c7814l, arrayList, null, 0L, null, 1007);
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f18992l;
        boolean z = this.f18993l;
        Object obj2 = this.f18991l;
        switch (i) {
            case 0:
                C9239l c9239l = new C9239l((C16076l) obj2, z, interfaceC14029l, 0);
                c9239l.f18990l = obj;
                return c9239l;
            case 1:
                return new C9239l(z, (C5056l) obj2, this.f18990l, interfaceC14029l);
            default:
                C9239l c9239l2 = new C9239l((EnumC14435l) obj2, z, interfaceC14029l, 2);
                c9239l2.f18990l = obj;
                return c9239l2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18992l) {
            case 0:
                return ((C9239l) ads((InterfaceC14029l) obj2, (C16811l) obj)).Signature(Unit.INSTANCE);
            case 1:
                return ((C9239l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C9239l) ads((InterfaceC14029l) obj2, (C7814l) obj)).Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9239l(Object obj, boolean z, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f18992l = i;
        this.f18991l = obj;
        this.f18993l = z;
    }
}
