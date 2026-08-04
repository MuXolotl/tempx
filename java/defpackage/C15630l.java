package defpackage;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lّٕؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15630l extends AbstractC11188l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C6367l f30558l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C8688l f30559l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C1080l f30560l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C8688l f30561l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C7784l f30562l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C8688l f30563l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final InterfaceC9354l f30564l;

    public C15630l(C7037l c7037l, SocketAddress socketAddress, SocketAddress socketAddress2, InterfaceC9354l interfaceC9354l, C7784l c7784l) {
        super(c7037l);
        this.f30562l = c7784l;
        final int i = 0;
        this.f30561l = new C8688l(new Function0(this) { // from class: lُۛۗ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C15630l f22835l;

            {
                this.f22835l = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [goto, lَُٙ] */
            /* JADX WARN: Type inference failed for: r6v0 */
            /* JADX WARN: Type inference failed for: r6v1 */
            /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r6v3, types: [lّؔۜ] */
            /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ?? arrayList;
                int i2 = i;
                C15630l c15630l = this.f22835l;
                switch (i2) {
                    case 0:
                        return new C12369l(c15630l);
                    case 1:
                        InterfaceC14665l interfaceC14665lVip = c15630l.vip();
                        ?? c10954l = new C10954l(13);
                        for (String str : c15630l.vip().names()) {
                            List listAdvert = interfaceC14665lVip.advert(str);
                            if (listAdvert != null) {
                                arrayList = new ArrayList(AbstractC14055l.billing(listAdvert, 10));
                                Iterator it = listAdvert.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(AbstractC2208l.amazon(0, 0, 11, (String) it.next()));
                                }
                            } else {
                                arrayList = 0;
                            }
                            if (arrayList == 0) {
                                arrayList = C2580l.f5619l;
                            }
                            c10954l.mo199class(AbstractC2208l.amazon(0, 0, 15, str), arrayList);
                        }
                        Object objBuild = c10954l.build();
                        Set setMopub = ((AbstractC17722l) objBuild).mopub();
                        if ((setMopub instanceof Collection) && setMopub.isEmpty()) {
                            return objBuild;
                        }
                        Iterator it2 = setMopub.iterator();
                        while (it2.hasNext()) {
                            if (((List) ((Map.Entry) it2.next()).getValue()).isEmpty()) {
                                return new C5358l((C18708l) objBuild);
                            }
                        }
                        return objBuild;
                    default:
                        String string = c15630l.f30562l.f16309l.toString();
                        int iM3321extends = AbstractC12024l.m3321extends(string, '?', 0, 6);
                        Integer numValueOf = iM3321extends != -1 ? Integer.valueOf(iM3321extends) : null;
                        if (numValueOf != null) {
                            return AbstractC12311l.smaato(numValueOf.intValue() + 1, 4, string);
                        }
                        InterfaceC14665l.loadAd.getClass();
                        return C8070l.crashlytics;
                }
            }
        });
        this.f30564l = interfaceC9354l;
        C14740l c14740l = c7784l.f16307l;
        this.f30558l = new C6367l(c14740l);
        final int i2 = 1;
        this.f30559l = new C8688l(new Function0(this) { // from class: lُۛۗ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C15630l f22835l;

            {
                this.f22835l = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [goto, lَُٙ] */
            /* JADX WARN: Type inference failed for: r6v0 */
            /* JADX WARN: Type inference failed for: r6v1 */
            /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r6v3, types: [lّؔۜ] */
            /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ?? arrayList;
                int i3 = i2;
                C15630l c15630l = this.f22835l;
                switch (i3) {
                    case 0:
                        return new C12369l(c15630l);
                    case 1:
                        InterfaceC14665l interfaceC14665lVip = c15630l.vip();
                        ?? c10954l = new C10954l(13);
                        for (String str : c15630l.vip().names()) {
                            List listAdvert = interfaceC14665lVip.advert(str);
                            if (listAdvert != null) {
                                arrayList = new ArrayList(AbstractC14055l.billing(listAdvert, 10));
                                Iterator it = listAdvert.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(AbstractC2208l.amazon(0, 0, 11, (String) it.next()));
                                }
                            } else {
                                arrayList = 0;
                            }
                            if (arrayList == 0) {
                                arrayList = C2580l.f5619l;
                            }
                            c10954l.mo199class(AbstractC2208l.amazon(0, 0, 15, str), arrayList);
                        }
                        Object objBuild = c10954l.build();
                        Set setMopub = ((AbstractC17722l) objBuild).mopub();
                        if ((setMopub instanceof Collection) && setMopub.isEmpty()) {
                            return objBuild;
                        }
                        Iterator it2 = setMopub.iterator();
                        while (it2.hasNext()) {
                            if (((List) ((Map.Entry) it2.next()).getValue()).isEmpty()) {
                                return new C5358l((C18708l) objBuild);
                            }
                        }
                        return objBuild;
                    default:
                        String string = c15630l.f30562l.f16309l.toString();
                        int iM3321extends = AbstractC12024l.m3321extends(string, '?', 0, 6);
                        Integer numValueOf = iM3321extends != -1 ? Integer.valueOf(iM3321extends) : null;
                        if (numValueOf != null) {
                            return AbstractC12311l.smaato(numValueOf.intValue() + 1, 4, string);
                        }
                        InterfaceC14665l.loadAd.getClass();
                        return C8070l.crashlytics;
                }
            }
        });
        final int i3 = 2;
        this.f30563l = new C8688l(new Function0(this) { // from class: lُۛۗ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C15630l f22835l;

            {
                this.f22835l = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [goto, lَُٙ] */
            /* JADX WARN: Type inference failed for: r6v0 */
            /* JADX WARN: Type inference failed for: r6v1 */
            /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r6v3, types: [lّؔۜ] */
            /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ?? arrayList;
                int i4 = i3;
                C15630l c15630l = this.f22835l;
                switch (i4) {
                    case 0:
                        return new C12369l(c15630l);
                    case 1:
                        InterfaceC14665l interfaceC14665lVip = c15630l.vip();
                        ?? c10954l = new C10954l(13);
                        for (String str : c15630l.vip().names()) {
                            List listAdvert = interfaceC14665lVip.advert(str);
                            if (listAdvert != null) {
                                arrayList = new ArrayList(AbstractC14055l.billing(listAdvert, 10));
                                Iterator it = listAdvert.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(AbstractC2208l.amazon(0, 0, 11, (String) it.next()));
                                }
                            } else {
                                arrayList = 0;
                            }
                            if (arrayList == 0) {
                                arrayList = C2580l.f5619l;
                            }
                            c10954l.mo199class(AbstractC2208l.amazon(0, 0, 15, str), arrayList);
                        }
                        Object objBuild = c10954l.build();
                        Set setMopub = ((AbstractC17722l) objBuild).mopub();
                        if ((setMopub instanceof Collection) && setMopub.isEmpty()) {
                            return objBuild;
                        }
                        Iterator it2 = setMopub.iterator();
                        while (it2.hasNext()) {
                            if (((List) ((Map.Entry) it2.next()).getValue()).isEmpty()) {
                                return new C5358l((C18708l) objBuild);
                            }
                        }
                        return objBuild;
                    default:
                        String string = c15630l.f30562l.f16309l.toString();
                        int iM3321extends = AbstractC12024l.m3321extends(string, '?', 0, 6);
                        Integer numValueOf = iM3321extends != -1 ? Integer.valueOf(iM3321extends) : null;
                        if (numValueOf != null) {
                            return AbstractC12311l.smaato(numValueOf.intValue() + 1, 4, string);
                        }
                        InterfaceC14665l.loadAd.getClass();
                        return C8070l.crashlytics;
                }
            }
        });
        String string = c7784l.f16308l.toString();
        String string2 = c7784l.f16309l.toString();
        C13545l c13545lYandex = c14740l.yandex("Host");
        if (c13545lYandex != null) {
            c13545lYandex.toString();
        }
        C17721l c17721l = C17721l.loadAd;
        String str = c7784l.f16305l.yandex;
        C17721l c17721l2 = C17721l.loadAd;
        if (!str.equals("GET")) {
            c17721l2 = C17721l.crashlytics;
            if (!str.equals("POST")) {
                c17721l2 = C17721l.amazon;
                if (!str.equals("PUT")) {
                    c17721l2 = C17721l.purchase;
                    if (!str.equals("PATCH")) {
                        c17721l2 = C17721l.subs;
                        if (!str.equals("TRACE")) {
                            c17721l2 = C17721l.billing;
                            if (!str.equals("DELETE")) {
                                c17721l2 = C17721l.mopub;
                                if (!str.equals("HEAD")) {
                                    c17721l2 = C17721l.isPro;
                                    if (!str.equals("QUERY")) {
                                        c17721l2 = C17721l.admob;
                                        if (!str.equals("OPTIONS")) {
                                            c17721l2 = new C17721l(str);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.f30560l = new C1080l(socketAddress, socketAddress2, string, string2, c17721l2);
    }

    @Override // defpackage.InterfaceC14280l
    public final C12369l loadAd() {
        return (C12369l) this.f30561l.getValue();
    }

    @Override // defpackage.InterfaceC14280l
    public final InterfaceC14665l pro() {
        return (InterfaceC14665l) this.f30559l.getValue();
    }

    @Override // defpackage.InterfaceC14280l
    public final InterfaceC16746l subs() {
        return this.f30560l;
    }

    @Override // defpackage.InterfaceC14280l
    public final InterfaceC14665l vip() {
        return (InterfaceC14665l) this.f30563l.getValue();
    }
}
