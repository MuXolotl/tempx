package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lًٛۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8122l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public boolean f16921l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public /* synthetic */ Object f16922l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f16923l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ Object f16924l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f16925l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8122l(InterfaceC14029l interfaceC14029l, AbstractC15781l abstractC15781l, Function1 function1, boolean z) {
        super(2, interfaceC14029l);
        this.f16923l = 2;
        this.f16922l = abstractC15781l;
        this.f16921l = z;
        this.f16924l = function1;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        Object objFirebase;
        Object objAdmob;
        Object objFirebase2;
        boolean zStartapp;
        int i = this.f16923l;
        InterfaceC11805l c11392l = C4618l.yandex;
        Object obj2 = this.f16924l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                C10086l c10086l = ((C7721l) this.f16922l).f16198l;
                int i2 = this.f16925l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    if (this.f16921l && ((Boolean) c10086l.getValue()).booleanValue()) {
                        C2887l c2887l = (C2887l) obj2;
                        int iMetrica = c2887l.metrica() + 1;
                        this.f16925l = 1;
                        if (c2887l.billing(iMetrica, AbstractC0532l.admob(0.0f, 0.0f, null, 7), this) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i2 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                c10086l.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 1:
                C15068l c15068l = (C15068l) this.f16922l;
                int i3 = this.f16925l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC6942l interfaceC6942l = c15068l.f29599l;
                    this.f16925l = 1;
                    objFirebase = AbstractC0622l.firebase(interfaceC6942l, this);
                    if (objFirebase == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i3 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                    objFirebase = obj;
                }
                InterfaceC13238l interfaceC13238l = (InterfaceC13238l) objFirebase;
                AppActivity appActivity = (AppActivity) c15068l.isVip();
                ArrayList arrayList = new ArrayList(AbstractC14055l.billing(interfaceC13238l, 10));
                Iterator<E> it = interfaceC13238l.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CachedTrack) it.next()).m4635implements());
                }
                C14247l c14247l = new C14247l(arrayList);
                CachedTrack cachedTrack = (CachedTrack) obj2;
                String strPremium = cachedTrack != null ? cachedTrack.premium() : null;
                if (strPremium != null) {
                    c11392l = new C11392l(strPremium);
                }
                InterfaceC11805l interfaceC11805l = c11392l;
                ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(interfaceC13238l, 10));
                Iterator<E> it2 = interfaceC13238l.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((CachedTrack) it2.next()).crashlytics());
                }
                AbstractC9092l.crashlytics(appActivity, c14247l, new C13305l(interfaceC11805l, 0L, arrayList2, false, false, this.f16921l, 90));
                return Unit.INSTANCE;
            case 2:
                int i4 = this.f16925l;
                if (i4 != 0) {
                    if (i4 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                AbstractC15781l abstractC15781l = (AbstractC15781l) this.f16922l;
                boolean z = this.f16921l;
                C14822l c14822l = new C14822l(null, abstractC15781l, (Function1) obj2, z);
                this.f16925l = 1;
                Object objMetrica = abstractC15781l.metrica(z, c14822l, this);
                return objMetrica == enumC9342l ? enumC9342l : objMetrica;
            case 3:
                C0360l c0360l = (C0360l) this.f16922l;
                int i5 = this.f16925l;
                if (i5 != 0) {
                    if (i5 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                C3637l c3637l = new C3637l(this.f16921l, c0360l, (Function2) obj2, null);
                this.f16925l = 1;
                Object objAds = AbstractC5088l.ads(c3637l, this);
                return objAds == enumC9342l ? enumC9342l : objAds;
            case 4:
                int i6 = this.f16925l;
                if (i6 != 0) {
                    if (i6 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                InterfaceC1142l interfaceC1142lAdmob = C14358l.smaato((C14358l) this.f16922l).admob((LinkedHashSet) obj2, this.f16921l);
                this.f16925l = 1;
                Object objFirebase3 = ((C9426l) interfaceC1142lAdmob).firebase(this);
                return objFirebase3 == enumC9342l ? enumC9342l : objFirebase3;
            case 5:
                int i7 = this.f16925l;
                try {
                    if (i7 == 0) {
                        AbstractC2829l.crashlytics(obj);
                        C16534l c16534l = new C16534l(new String[]{(String) obj2});
                        this.f16922l = null;
                        this.f16925l = 1;
                        objAdmob = AbstractC8189l.admob(c16534l, this);
                        if (objAdmob == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (i7 != 1) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                        objAdmob = obj;
                    }
                    AudioTrack audioTrack = (AudioTrack) AbstractC16901l.m4217extends((List) objAdmob);
                    if (audioTrack != null) {
                        C16076l c16076l = VKXApplication.f36632l;
                        (c16076l != null ? c16076l : null).yandex(Collections.singletonList(audioTrack), this.f16921l);
                        break;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return Unit.INSTANCE;
            case 6:
                C11655l c11655l = (C11655l) this.f16922l;
                int i8 = this.f16925l;
                if (i8 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC6942l interfaceC6942l2 = c11655l.f23370l;
                    this.f16925l = 1;
                    objFirebase2 = AbstractC0622l.firebase(interfaceC6942l2, this);
                    if (objFirebase2 == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i8 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                    objFirebase2 = obj;
                }
                InterfaceC13238l interfaceC13238l2 = (InterfaceC13238l) objFirebase2;
                AppActivity appActivity2 = (AppActivity) c11655l.isVip();
                ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(interfaceC13238l2, 10));
                Iterator<E> it3 = interfaceC13238l2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((CachedTrack) it3.next()).m4635implements());
                }
                C14247l c14247l2 = new C14247l(arrayList3);
                CachedTrack cachedTrack2 = (CachedTrack) obj2;
                String strPremium2 = cachedTrack2 != null ? cachedTrack2.premium() : null;
                if (strPremium2 != null) {
                    c11392l = new C11392l(strPremium2);
                }
                InterfaceC11805l interfaceC11805l2 = c11392l;
                ArrayList arrayList4 = new ArrayList(AbstractC14055l.billing(interfaceC13238l2, 10));
                Iterator<E> it4 = interfaceC13238l2.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(((CachedTrack) it4.next()).crashlytics());
                }
                AbstractC9092l.crashlytics(appActivity2, c14247l2, new C13305l(interfaceC11805l2, 0L, arrayList4, false, false, this.f16921l, 90));
                return Unit.INSTANCE;
            case 7:
                C16811l c16811l = (C16811l) this.f16922l;
                int i9 = this.f16925l;
                if (i9 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    zStartapp = c16811l.startapp();
                    this.f16922l = c16811l;
                    this.f16921l = zStartapp;
                    this.f16925l = 1;
                    if (((C7864l) obj2).invoke(c16811l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i9 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zStartapp = this.f16921l;
                    AbstractC2829l.crashlytics(obj);
                }
                if (zStartapp) {
                    c16811l.mo2801protected();
                }
                return Unit.INSTANCE;
            case 8:
                boolean z2 = this.f16921l;
                C8998l c8998l = (C8998l) this.f16922l;
                int i10 = this.f16925l;
                if (i10 != 0) {
                    if (i10 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return Unit.INSTANCE;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                if (((Number) c8998l.f18553l.getValue()).floatValue() == 0.0f && !z2) {
                    return Unit.INSTANCE;
                }
                int i11 = C17517l.f34136l;
                C10712l c10712l = (C10712l) ((C14830l) obj2).getValue();
                float f = z2 ? 1.0f : -1.0f;
                this.f16925l = 1;
                int iBilling = c8998l.billing();
                boolean zBooleanValue = ((Boolean) c8998l.f18549l.getValue()).booleanValue();
                if (c8998l.f18548l.getValue() != null) {
                    C18725l.loadAd();
                    return null;
                }
                Object objLoadAd = C16801l.loadAd(c8998l.f18554l, new C17703l(c8998l, iBilling, zBooleanValue, f, c10712l, ((f >= 0.0f || c10712l != null) && (c10712l == null || f >= 0.0f)) ? 0.0f : 1.0f, 2, null), this);
                if (objLoadAd != enumC9342l) {
                    objLoadAd = Unit.INSTANCE;
                }
                if (objLoadAd == enumC9342l) {
                    return enumC9342l;
                }
                return Unit.INSTANCE;
            default:
                int i12 = this.f16925l;
                if (i12 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C5616l c5616l = (C5616l) this.f16922l;
                    float f2 = this.f16921l ? 1.0f : 0.8f;
                    this.f16925l = 1;
                    if (C5616l.loadAd(c5616l, new Float(f2), (InterfaceC1489l) obj2, null, null, this, 12) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i12 != 1) {
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
        int i = this.f16923l;
        Object obj2 = this.f16924l;
        switch (i) {
            case 0:
                return new C8122l(this.f16921l, (C7721l) this.f16922l, (C2887l) obj2, interfaceC14029l);
            case 1:
                return new C8122l((C15068l) this.f16922l, (CachedTrack) obj2, this.f16921l, interfaceC14029l, 1);
            case 2:
                return new C8122l(interfaceC14029l, (AbstractC15781l) this.f16922l, (Function1) obj2, this.f16921l);
            case 3:
                return new C8122l((C0360l) this.f16922l, (InterfaceC8282l) null, this.f16921l, (Function2) obj2, interfaceC14029l);
            case 4:
                return new C8122l((C14358l) this.f16922l, interfaceC14029l, this.f16921l, (LinkedHashSet) obj2);
            case 5:
                C8122l c8122l = new C8122l(interfaceC14029l, (String) obj2, this.f16921l);
                c8122l.f16922l = obj;
                return c8122l;
            case 6:
                return new C8122l((C11655l) this.f16922l, (CachedTrack) obj2, this.f16921l, interfaceC14029l, 6);
            case 7:
                C8122l c8122l2 = new C8122l((C7864l) obj2, interfaceC14029l);
                c8122l2.f16922l = obj;
                return c8122l2;
            case 8:
                return new C8122l((C8998l) this.f16922l, this.f16921l, (C14830l) obj2, interfaceC14029l, 8);
            default:
                return new C8122l((C5616l) this.f16922l, this.f16921l, (InterfaceC1489l) obj2, interfaceC14029l, 9);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16923l) {
            case 0:
                return ((C8122l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 1:
                return ((C8122l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 2:
                return ((C8122l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 3:
                return ((C8122l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 4:
                return ((C8122l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 5:
                return ((C8122l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 6:
                return ((C8122l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 7:
                return ((C8122l) ads((InterfaceC14029l) obj2, (C16811l) obj)).Signature(Unit.INSTANCE);
            case 8:
                return ((C8122l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C8122l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8122l(AbstractC10581l abstractC10581l, CachedTrack cachedTrack, boolean z, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f16923l = i;
        this.f16922l = abstractC10581l;
        this.f16924l = cachedTrack;
        this.f16921l = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8122l(InterfaceC14029l interfaceC14029l, String str, boolean z) {
        super(2, interfaceC14029l);
        this.f16923l = 5;
        this.f16924l = str;
        this.f16921l = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8122l(C0360l c0360l, InterfaceC8282l interfaceC8282l, boolean z, Function2 function2, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f16923l = 3;
        this.f16922l = c0360l;
        this.f16921l = z;
        this.f16924l = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8122l(C14358l c14358l, InterfaceC14029l interfaceC14029l, boolean z, LinkedHashSet linkedHashSet) {
        super(2, interfaceC14029l);
        this.f16923l = 4;
        this.f16922l = c14358l;
        this.f16921l = z;
        this.f16924l = linkedHashSet;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8122l(C7864l c7864l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f16923l = 7;
        this.f16924l = c7864l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8122l(Object obj, boolean z, Object obj2, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f16923l = i;
        this.f16922l = obj;
        this.f16921l = z;
        this.f16924l = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8122l(boolean z, C7721l c7721l, C2887l c2887l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f16923l = 0;
        this.f16921l = z;
        this.f16922l = c7721l;
        this.f16924l = c2887l;
    }
}
