package defpackage;

import android.content.Context;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lؒؓٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0797l implements InterfaceC11210l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public String f2412l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public String f2413l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2414l = 1;

    public C0797l(String str, String str2) {
        this.f2413l = str;
        this.f2412l = str2;
    }

    @Override // defpackage.InterfaceC11210l
    public Object billing(C11039l c11039l) throws Throwable {
        String str = this.f2413l;
        C16552l c16552l = AbstractC11463l.yandex;
        Object objFirebase = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C0932l(str, null, 13), c11039l);
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (objFirebase != enumC9342l) {
            objFirebase = Unit.INSTANCE;
        }
        return objFirebase == enumC9342l ? objFirebase : Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC11210l
    public String crashlytics(Context context) {
        return this.f2412l;
    }

    public boolean equals(Object obj) {
        switch (this.f2414l) {
            case 1:
                if (!(obj instanceof C17879l)) {
                    return false;
                }
                C17879l c17879l = (C17879l) obj;
                Object obj2 = c17879l.yandex;
                String str = this.f2413l;
                if (obj2 != str && (obj2 == null || !obj2.equals(str))) {
                    return false;
                }
                Object obj3 = c17879l.loadAd;
                String str2 = this.f2412l;
                return obj3 == str2 || (obj3 != null && obj3.equals(str2));
            default:
                return super.equals(obj);
        }
    }

    public int hashCode() {
        switch (this.f2414l) {
            case 1:
                String str = this.f2413l;
                int iHashCode = str == null ? 0 : str.hashCode();
                String str2 = this.f2412l;
                return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    @Override // defpackage.InterfaceC11210l
    public C8195l loadAd() {
        List listM3338public = AbstractC12024l.m3338public(this.f2413l, new String[]{"_"}, 6);
        String str = (String) AbstractC16901l.m4220for(1, listM3338public);
        if (str == null) {
            return null;
        }
        int i = Integer.parseInt(str);
        String str2 = (String) AbstractC16901l.m4220for(0, listM3338public);
        if (str2 == null) {
            return null;
        }
        return new C8195l(Integer.valueOf(i), Long.valueOf(Long.parseLong(str2)));
    }

    @Override // defpackage.InterfaceC11210l
    public InterfaceC6942l subs() {
        InterfaceC6942l interfaceC6942lAdcel;
        C5198l c5198lM3161l = C6336l.loadAd.m3161l();
        return (c5198lM3161l == null || (interfaceC6942lAdcel = AbstractC4338l.adcel(c5198lM3161l.m1735l(AbstractC18202l.yandex.loadAd(CachedTrack.class), "albumFullId == $0", Arrays.copyOf(new Object[]{this.f2413l}, 1)).loadAd("title", "subtitle"))) == null) ? new C14970l(5, C11507l.f23131l) : new C13900l(interfaceC6942lAdcel, 13);
    }

    public String toString() {
        switch (this.f2414l) {
            case 1:
                return "Pair{" + ((Object) this.f2413l) + " " + ((Object) this.f2412l) + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C0797l() {
    }
}
