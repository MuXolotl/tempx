package defpackage;

import android.content.Context;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lٌۙؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9012l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f18570l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f18571l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f18572l;

    public /* synthetic */ C9012l(Object obj, boolean z, int i) {
        this.f18572l = i;
        this.f18570l = obj;
        this.f18571l = z;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00dc  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC2851l interfaceC2851lFirebase;
        int i = this.f18572l;
        int i2 = 0;
        Object obj2 = this.f18570l;
        boolean z = this.f18571l;
        switch (i) {
            case 0:
                CachedTrack cachedTrack = (CachedTrack) obj2;
                C3918l c3918l = (C3918l) obj;
                if (AbstractC15011l.isPro(cachedTrack)) {
                    C1332l c1332l = cachedTrack.f36787l;
                    if (c1332l == null) {
                        cachedTrack = null;
                    } else if (!AbstractC8576l.yandex(c1332l.f3419l, c3918l.remoteconfig())) {
                        C1332l c1332lPurchase = c1332l.purchase(c3918l.remoteconfig(), c1332l.f3420l);
                        if (c1332lPurchase != null) {
                            interfaceC2851lFirebase = AbstractC6710l.firebase(c1332lPurchase);
                        } else {
                            interfaceC2851lFirebase = null;
                        }
                    }
                    if (cachedTrack == null) {
                        C8339l.metrica("Unmanaged objects must be part of the Realm, before they can be queried this way. Use `MutableRealm.copyToRealm()` to turn it into a managed object.");
                        return null;
                    }
                    interfaceC2851lFirebase = cachedTrack;
                } else {
                    interfaceC2851lFirebase = null;
                }
                CachedTrack cachedTrack2 = (CachedTrack) interfaceC2851lFirebase;
                if (cachedTrack2 == null) {
                    return null;
                }
                cachedTrack2.m4634goto(false);
                cachedTrack2.m4651throw(z);
                return Unit.INSTANCE;
            case 1:
                C10968l c10968l = (C10968l) obj2;
                ((C4983l) c10968l.f33215l).purchase(z);
                ((C11541l) c10968l.f33214l).mopub(z);
                return new C4466l((C15063l) obj, c10968l, i2);
            case 2:
                C11625l c11625l = (C11625l) obj2;
                InterfaceC17593l interfaceC17593l = (InterfaceC17593l) obj;
                if (!z) {
                    AbstractC3668l.yandex(interfaceC17593l);
                }
                C14120l c14120l = new C14120l(c11625l, i2);
                InterfaceC13922l[] interfaceC13922lArr = AbstractC3668l.yandex;
                interfaceC17593l.amazon(AbstractC16601l.subs, new C7629l(null, c14120l));
                return Unit.INSTANCE;
            case 3:
                C6449l c6449l = (C6449l) obj2;
                c6449l.m2011l(z);
                return new C4466l((C15063l) obj, c6449l, 1);
            case 4:
                InterfaceC17593l interfaceC17593l2 = (InterfaceC17593l) obj;
                AbstractC3668l.crashlytics(interfaceC17593l2, new C5583l(10, (Function0) obj2));
                interfaceC17593l2.amazon(AbstractC16601l.crashlytics, new C7629l(null, new C5146l(27)));
                if (!z) {
                    AbstractC3668l.yandex(interfaceC17593l2);
                }
                return Unit.INSTANCE;
            default:
                Context context = (Context) obj2;
                List list = (List) obj;
                C16076l c16076l = VKXApplication.f36632l;
                if (c16076l == null) {
                    c16076l = null;
                }
                c16076l.yandex(list, z);
                AppActivity appActivity = context instanceof AppActivity ? (AppActivity) context : null;
                if (appActivity != null) {
                    Integer numValueOf = Integer.valueOf(R.drawable.ic_list_add_outline_28);
                    VKXApplication vKXApplication = VKXApplication.f36631l;
                    C6666l.yandex(appActivity, new C10734l(numValueOf, (vKXApplication != null ? vKXApplication : null).getString(R.string.play_next_ok), null, null, null, 212));
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C9012l(boolean z, Object obj, int i) {
        this.f18572l = i;
        this.f18571l = z;
        this.f18570l = obj;
    }
}
