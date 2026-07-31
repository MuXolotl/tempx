package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: lّٞۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12748l {
    public static final LinkedHashMap loadAd;
    public static final Map yandex;

    static {
        EnumC7061l enumC7061l = EnumC7061l.VALUE_PARAMETER;
        List listRemoteconfig = AbstractC14055l.remoteconfig(EnumC7061l.FIELD, EnumC7061l.METHOD_RETURN_TYPE, enumC7061l, EnumC7061l.TYPE_PARAMETER_BOUNDS, EnumC7061l.TYPE_USE);
        List listSingletonList = Collections.singletonList(enumC7061l);
        C2312l c2312l = AbstractC6587l.yandex;
        EnumC10249l enumC10249l = EnumC10249l.f20871l;
        Map mapRemoteconfig = AbstractC8676l.remoteconfig(new C8195l(c2312l, new C8622l(new C6639l(enumC10249l, false), listRemoteconfig, false, true, true)), new C8195l(AbstractC6587l.loadAd, new C8622l(new C6639l(enumC10249l, false), listRemoteconfig, false, true, true)), new C8195l(AbstractC6587l.crashlytics, new C8622l(new C6639l(EnumC10249l.f20873l, false), listRemoteconfig, 4)));
        yandex = mapRemoteconfig;
        loadAd = AbstractC8676l.metrica(mapRemoteconfig, AbstractC8676l.remoteconfig(new C8195l(AbstractC6587l.admob, new C8622l(new C6639l(enumC10249l, false), listSingletonList, 28)), new C8195l(AbstractC6587l.subs, new C8622l(new C6639l(EnumC10249l.f20872l, false), listSingletonList, 28))));
    }
}
