package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* JADX INFO: renamed from: lۦؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C18695l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f36459l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f36460l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f36461l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f36462l;

    public /* synthetic */ C18695l(InterfaceC2262l interfaceC2262l, AbstractC13264l abstractC13264l, int i) {
        this.f36461l = 3;
        this.f36459l = interfaceC2262l;
        this.f36462l = abstractC13264l;
        this.f36460l = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C5680l c5680l;
        boolean z = true;
        switch (this.f36461l) {
            case 0:
                InterfaceC15879l interfaceC15879l = (InterfaceC15879l) this.f36459l;
                int i = this.f36460l;
                C4835l c4835l = (C4835l) this.f36462l;
                InterfaceC15879l interfaceC15879l2 = interfaceC15879l;
                int i2 = i == 2 ? 2 : 1;
                InterfaceC2360l interfaceC2360lAd = interfaceC15879l2.ad();
                if (i2 != 2) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    TreeMap treeMap = new TreeMap(new C16027l(false));
                    C18680l c18680l = C18680l.purchase;
                    for (C18680l c18680l2 : new ArrayList(C18680l.remoteconfig)) {
                        AbstractC5641l.purchase("Currently only support ConstantQuality", c18680l2 instanceof C18680l);
                        InterfaceC15313l interfaceC15313lLoadAd = interfaceC2360lAd.loadAd(c18680l2.yandex(i2));
                        if (interfaceC15313lLoadAd != null) {
                            AbstractC5088l.yandex("CapabilitiesByQuality", "profiles = " + interfaceC15313lLoadAd);
                            if (interfaceC15313lLoadAd.amazon().isEmpty()) {
                                c5680l = null;
                            } else {
                                int iYandex = interfaceC15313lLoadAd.yandex();
                                int iLoadAd = interfaceC15313lLoadAd.loadAd();
                                List listCrashlytics = interfaceC15313lLoadAd.crashlytics();
                                List listAmazon = interfaceC15313lLoadAd.amazon();
                                AbstractC5641l.loadAd(listAmazon.isEmpty() ^ z, "Should contain at least one VideoProfile.");
                                c5680l = new C5680l(iYandex, iLoadAd, DesugarCollections.unmodifiableList(new ArrayList(listCrashlytics)), DesugarCollections.unmodifiableList(new ArrayList(listAmazon)), !listCrashlytics.isEmpty() ? (C12539l) listCrashlytics.get(0) : null, (C6410l) listAmazon.get(0));
                            }
                            if (c5680l == null) {
                                AbstractC5088l.tapsense("CapabilitiesByQuality", "EncoderProfiles of quality " + c18680l2 + " has no video validated profiles.");
                            } else {
                                treeMap.put(c5680l.billing.yandex(), c18680l2);
                                linkedHashMap.put(c18680l2, c5680l);
                            }
                            z = z;
                        }
                    }
                    boolean z2 = z;
                    if (linkedHashMap.isEmpty()) {
                        AbstractC5088l.crashlytics("CapabilitiesByQuality", "No supported EncoderProfiles");
                    } else {
                        ArrayDeque arrayDeque = new ArrayDeque(linkedHashMap.values());
                    }
                    if (new ArrayList(linkedHashMap.keySet()).isEmpty()) {
                        AbstractC5088l.tapsense("EncoderProfilesResolver", "Camera EncoderProfilesProvider doesn't contain any supported Quality.");
                        C18680l[] c18680lArr = new C18680l[3];
                        c18680lArr[0] = C18680l.mopub;
                        c18680lArr[z2 ? 1 : 0] = C18680l.billing;
                        c18680lArr[2] = C18680l.purchase;
                        interfaceC2360lAd = new C9656l(interfaceC15879l2, AbstractC14055l.remoteconfig(c18680lArr), c4835l);
                    }
                    C17735l c17735l = AbstractC1469l.yandex;
                    C9075l c9075l = new C9075l(new C10148l(interfaceC2360lAd, c17735l, interfaceC15879l2, c4835l), c17735l);
                    Set<C15421l> setLoadAd = interfaceC15879l2.loadAd();
                    if (!(setLoadAd instanceof Collection) || !setLoadAd.isEmpty()) {
                        for (C15421l c15421l : setLoadAd) {
                            if (c15421l.yandex == 3 && c15421l.loadAd == 10) {
                                c9075l = new C9075l(c9075l, c4835l);
                            }
                        }
                    }
                    interfaceC2360lAd = new C0646l(c9075l, interfaceC15879l2, c17735l);
                } else if (!interfaceC15879l2.smaato()) {
                    interfaceC2360lAd = InterfaceC2360l.yandex;
                }
                return new C5012l(interfaceC2360lAd, i2, interfaceC15879l2.loadAd());
            case 1:
                int i3 = this.f36460l;
                String str = (String) this.f36459l;
                C4955l c4955l = (C4955l) this.f36462l;
                InterfaceC18035l[] interfaceC18035lArr = new InterfaceC18035l[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    interfaceC18035lArr[i4] = AbstractC16814l.purchase(str + '.' + c4955l.purchase[i4], C16015l.purchase, new InterfaceC18035l[0]);
                }
                return interfaceC18035lArr;
            case 2:
                int i5 = this.f36460l;
                AudioTrack audioTrack = (AudioTrack) this.f36459l;
                C6038l c6038l = (C6038l) this.f36462l;
                int i6 = audioTrack.purchase;
                String str2 = audioTrack.yandex;
                if (i5 >= i6) {
                    c6038l.m1922finally(0L, str2);
                } else {
                    c6038l.m1922finally(i5, str2);
                }
                return Unit.INSTANCE;
            case 3:
                AbstractC10999l.mopub((InterfaceC2262l) this.f36459l, null, 0, new C18630l((AbstractC13264l) this.f36462l, this.f36460l, null, 1), 3);
                return Unit.INSTANCE;
            default:
                C18480l c18480l = (C18480l) this.f36459l;
                int i7 = this.f36460l;
                Function0 function0 = (Function0) this.f36462l;
                if (c18480l == null || c18480l.f36085l) {
                    return null;
                }
                return new C8195l(EnumC12456l.f24584l, new C8608l(c18480l, i7, function0, 7));
        }
    }

    public /* synthetic */ C18695l(int i, Object obj, Object obj2, int i2) {
        this.f36461l = i2;
        this.f36460l = i;
        this.f36459l = obj;
        this.f36462l = obj2;
    }

    public /* synthetic */ C18695l(Object obj, int i, Object obj2, int i2) {
        this.f36461l = i2;
        this.f36459l = obj;
        this.f36460l = i;
        this.f36462l = obj2;
    }
}
