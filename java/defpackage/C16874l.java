package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkxreborn.cache.realm.CachedAlbum;
import ua.itaysonlab.vkxreborn.cache.realm.CachedArtist;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;
import ua.itaysonlab.vkxreborn.cache.realm.CachedVkGenre;

/* JADX INFO: renamed from: lٕٗؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16874l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ List f32930l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ List f32931l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f32932l = 0;

    public /* synthetic */ C16874l(C8578l c8578l, List list, List list2) {
        this.f32931l = list;
        this.f32930l = list2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f32932l;
        List list = this.f32930l;
        List list2 = this.f32931l;
        switch (i) {
            case 0:
                AbstractC9601l abstractC9601l = (AbstractC9601l) obj;
                if (list2 != null) {
                    int size = list2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        C8195l c8195l = (C8195l) list2.get(i2);
                        AbstractC9601l.isPro(abstractC9601l, (AbstractC10113l) c8195l.f17098l, ((C5177l) c8195l.f17097l).yandex);
                    }
                }
                if (list != null) {
                    int size2 = list.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        C8195l c8195l2 = (C8195l) list.get(i3);
                        AbstractC10113l abstractC10113l = (AbstractC10113l) c8195l2.f17098l;
                        Function0 function0 = (Function0) c8195l2.f17097l;
                        AbstractC9601l.isPro(abstractC9601l, abstractC10113l, function0 != null ? ((C5177l) function0.invoke()).yandex : 0L);
                    }
                }
                break;
            default:
                C3918l c3918l = (C3918l) obj;
                if (Boolean.TRUE.booleanValue()) {
                    C15825l c15825lCrashlytics = c3918l.m1449l(AbstractC18202l.yandex.loadAd(CachedTrack.class), "@links.@count == 0", Arrays.copyOf(new Object[0], 0)).crashlytics();
                    Iterator it = c15825lCrashlytics.iterator();
                    while (it.hasNext()) {
                        String strPremium = ((CachedTrack) it.next()).premium();
                        if (strPremium != null) {
                            list2.add(strPremium);
                            Unit unit = Unit.INSTANCE;
                        }
                    }
                    c3918l.m1451l(c15825lCrashlytics);
                    C15825l c15825lCrashlytics2 = c3918l.m1449l(AbstractC18202l.yandex.loadAd(CachedAlbum.class), "@links.@count == 0", Arrays.copyOf(new Object[0], 0)).crashlytics();
                    Iterator it2 = c15825lCrashlytics2.iterator();
                    while (it2.hasNext()) {
                        String strRemoteconfig = ((CachedAlbum) it2.next()).remoteconfig();
                        if (strRemoteconfig != null) {
                            list.add(strRemoteconfig);
                            Unit unit2 = Unit.INSTANCE;
                        }
                    }
                    c3918l.m1451l(c15825lCrashlytics2);
                    C2336l c2336l = AbstractC18202l.yandex;
                    c3918l.m1451l(c3918l.m1449l(c2336l.loadAd(CachedArtist.class), "@links.@count == 0", Arrays.copyOf(new Object[0], 0)).crashlytics());
                    c3918l.m1451l(c3918l.m1449l(c2336l.loadAd(CachedVkGenre.class), "@links.@count == 0", Arrays.copyOf(new Object[0], 0)).crashlytics());
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C16874l(ArrayList arrayList, ArrayList arrayList2) {
        this.f32931l = arrayList;
        this.f32930l = arrayList2;
    }
}
