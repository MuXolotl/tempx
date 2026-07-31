package defpackage;

import android.content.Intent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.internal.objects.VKResponseWithItems;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lٜؖۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4261l extends AbstractC11801l implements InterfaceC0605l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C10086l f8745l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final C10086l f8746l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C10086l f8747l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final C4983l f8748l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public Throwable f8749l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final boolean f8750l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C1008l f8751l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final C11362l f8752l;

    public C4261l(boolean z) {
        super(0);
        this.f8750l = z;
        this.f8751l = AbstractC11190l.yandex("");
        Boolean bool = Boolean.FALSE;
        this.f8747l = AbstractC8020l.smaato(bool);
        this.f8746l = AbstractC8020l.smaato(bool);
        this.f8745l = AbstractC8020l.smaato(bool);
        this.f8752l = new C11362l();
        this.f8748l = new C4983l(8, this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: import, reason: not valid java name */
    public static final Object m1517import(C4261l c4261l, String str, InterfaceC14029l interfaceC14029l) {
        C8664l c8664l;
        Object c18435l;
        C10086l c10086l = c4261l.f8747l;
        C10086l c10086l2 = c4261l.f8745l;
        if (interfaceC14029l instanceof C8664l) {
            c8664l = (C8664l) interfaceC14029l;
            int i = c8664l.f17849l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c8664l.f17849l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c8664l = new C8664l(c4261l, interfaceC14029l);
            }
        } else {
            c8664l = new C8664l(c4261l, interfaceC14029l);
        }
        Object obj = c8664l.f17848l;
        int i2 = c8664l.f17849l;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(obj);
                c4261l.f8752l.clear();
                Boolean bool = Boolean.FALSE;
                c10086l2.setValue(bool);
                c4261l.f8746l.setValue(bool);
                c10086l.setValue(Boolean.TRUE);
                c8664l.f17849l = 1;
                Object objM1518abstract = c4261l.m1518abstract(str, 0, c8664l);
                Object obj2 = EnumC9342l.f19165l;
                if (objM1518abstract == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
            }
            c18435l = Unit.INSTANCE;
        } catch (Throwable th) {
            c18435l = new C18435l(th);
        }
        Throwable thYandex = C1171l.yandex(c18435l);
        if (thYandex != null) {
            c4261l.f8749l = thYandex;
            c10086l2.setValue(Boolean.TRUE);
        }
        c10086l.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final Object m1518abstract(String str, int i, AbstractC0283l abstractC0283l) {
        C10020l c10020l;
        if (abstractC0283l instanceof C10020l) {
            c10020l = (C10020l) abstractC0283l;
            int i2 = c10020l.f20414l;
            if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c10020l.f20414l = i2 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c10020l = new C10020l(this, abstractC0283l);
            }
        } else {
            c10020l = new C10020l(this, abstractC0283l);
        }
        Object objM1519instanceof = c10020l.f20413l;
        int i3 = c10020l.f20414l;
        if (i3 == 0) {
            AbstractC2829l.crashlytics(objM1519instanceof);
            c10020l.f20414l = 1;
            objM1519instanceof = m1519instanceof(str, i, c10020l);
            Object obj = EnumC9342l.f19165l;
            if (objM1519instanceof == obj) {
                return obj;
            }
        } else {
            if (i3 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objM1519instanceof);
        }
        List list = (List) objM1519instanceof;
        this.f8752l.addAll(list);
        this.f8746l.setValue(Boolean.valueOf(list.size() == 40));
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC11801l, defpackage.AbstractC2484l, defpackage.AbstractC17777l
    public final void appmetrica() {
        super.appmetrica();
        this.f8748l.amazon();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public final Object m1519instanceof(String str, int i, AbstractC0283l abstractC0283l) {
        C12429l c12429l;
        AbstractC8189l c12772l;
        if (abstractC0283l instanceof C12429l) {
            c12429l = (C12429l) abstractC0283l;
            int i2 = c12429l.f24540l;
            if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c12429l.f24540l = i2 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c12429l = new C12429l(this, abstractC0283l);
            }
        } else {
            c12429l = new C12429l(this, abstractC0283l);
        }
        Object objSubs = c12429l.f24539l;
        int i3 = c12429l.f24540l;
        if (i3 == 0) {
            AbstractC2829l.crashlytics(objSubs);
            int length = str.length();
            boolean z = this.f8750l;
            if (length > 0) {
                c12772l = z ? new C7093l(str, i, 2) : new C7093l(str, i, 1);
            } else {
                c12772l = z ? new C12772l(i, 20, (byte) 0) : new C12772l(i, 19, (byte) 0);
            }
            c12429l.f24540l = 1;
            objSubs = c12772l.subs(c12429l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objSubs == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i3 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objSubs);
        }
        return ((VKResponseWithItems) objSubs).yandex;
    }

    @Override // defpackage.InterfaceC0605l
    public final void mopub(String str) {
        C1008l c1008l = this.f8751l;
        c1008l.getClass();
        c1008l.remoteconfig(null, str);
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        c6956l.m2133new(-1870433615);
        int i2 = i | (c6956l.admob(this) ? 4 : 2);
        int i3 = 0;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = AbstractC12311l.isPro(c6956l);
                c6956l.m2147try(objM2132native);
            }
            InterfaceC2262l interfaceC2262l = (InterfaceC2262l) objM2132native;
            C1008l c1008l = this.f8751l;
            InterfaceC8714l interfaceC8714lAmazon = AbstractC3700l.amazon(c1008l, c6956l, 0);
            boolean zAdmob = c6956l.admob(this);
            Object objM2132native2 = c6956l.m2132native();
            if (zAdmob || objM2132native2 == c13863l) {
                objM2132native2 = new C17972l(this, (InterfaceC14029l) null, 6);
                c6956l.m2147try(objM2132native2);
            }
            AbstractC12311l.amazon(c6956l, c1008l, (Function2) objM2132native2);
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(-1155481227, new C12490l(this, interfaceC8714lAmazon, i3), c6956l), null, null, null, 0, 0L, 0L, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).amazon(c6956l), AbstractC14566l.amazon(37013440, new Cprotected(this, interfaceC8714lAmazon, interfaceC2262l, 28), c6956l), c6956l, 805306416, 253);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C17811l(this, i);
        }
    }

    @Override // defpackage.AbstractC17777l
    public final void premium() {
        ((AppActivity) isVip()).yandex().yandex(this.f8748l, this);
    }

    @Override // defpackage.InterfaceC0605l
    public final void remoteconfig(int i, int i2, Intent intent) {
        AbstractC9029l.yandex(this, i, i2, intent);
    }
}
