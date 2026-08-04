package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lُٗٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17207l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ CachedTrack f33396l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ boolean f33397l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f33398l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C6111l f33399l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17207l(C6111l c6111l, CachedTrack cachedTrack, boolean z, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f33399l = c6111l;
        this.f33396l = cachedTrack;
        this.f33397l = z;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        Object objFirebase;
        int i;
        int i2 = this.f33398l;
        C6111l c6111l = this.f33399l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            InterfaceC6942l interfaceC6942l = c6111l.m1943l().crashlytics;
            this.f33398l = 1;
            objFirebase = AbstractC0622l.firebase(interfaceC6942l, this);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objFirebase == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
            objFirebase = obj;
        }
        Iterable iterable = (Iterable) objFirebase;
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((C10893l) it.next()).yandex);
        }
        int iOrdinal = ((EnumC7195l) c6111l.f12898l.getValue()).ordinal();
        if (iOrdinal == 0) {
            i = R.string.cache_track_selector_my_library;
        } else if (iOrdinal == 1) {
            i = R.string.cache_track_selector_manual_library;
        } else {
            if (iOrdinal != 2) {
                C18725l.billing();
                return null;
            }
            i = R.string.cache_track_selector_all;
        }
        VKXApplication.Companion companion = VKXApplication.f36628l;
        String strLoadAd = VKXApplication.Companion.loadAd(i);
        AppActivity appActivity = (AppActivity) c6111l.isVip();
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((CachedTrack) it2.next()).m4635implements());
        }
        C14247l c14247l = new C14247l(strLoadAd, arrayList2);
        CachedTrack cachedTrack = this.f33396l;
        String strPremium = cachedTrack != null ? cachedTrack.premium() : null;
        InterfaceC11805l c11392l = strPremium != null ? new C11392l(strPremium) : C4618l.yandex;
        ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((CachedTrack) it3.next()).crashlytics());
        }
        AbstractC9092l.crashlytics(appActivity, c14247l, new C13305l(c11392l, 0L, arrayList3, false, false, this.f33397l, 90));
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        return new C17207l(this.f33399l, this.f33396l, this.f33397l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C17207l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
