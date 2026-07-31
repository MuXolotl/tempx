package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: l٘ؗۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17712l implements InterfaceC4182l {
    public final C18028l amazon;
    public C0511l crashlytics;
    public final C10202l loadAd;
    public final C16412l yandex;

    public C17712l(C16412l c16412l, C15053l c15053l, C10202l c10202l) {
        this.yandex = c16412l;
        this.loadAd = c10202l;
        this.amazon = c16412l.crashlytics(new C6238l(2, this));
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000b  */
    public final C8913l amazon(C2312l c2312l) {
        InputStream inputStream;
        if (c2312l.yandex.admob(AbstractC3974l.isPro)) {
            C7780l.remoteconfig.getClass();
            String strYandex = C7780l.yandex(c2312l);
            ClassLoader classLoader = C13863l.class.getClassLoader();
            if (classLoader == null) {
                inputStream = ClassLoader.getSystemResourceAsStream(strYandex);
            } else {
                URL resource = classLoader.getResource(strYandex);
                if (resource == null) {
                    inputStream = null;
                } else {
                    URLConnection uRLConnectionOpenConnection = resource.openConnection();
                    uRLConnectionOpenConnection.setUseCaches(false);
                    inputStream = uRLConnectionOpenConnection.getInputStream();
                }
            }
        } else {
            inputStream = null;
        }
        if (inputStream != null) {
            return AbstractC8441l.loadAd(c2312l, this.yandex, this.loadAd, inputStream);
        }
        return null;
    }

    @Override // defpackage.InterfaceC4182l
    public final void crashlytics(C2312l c2312l, ArrayList arrayList) {
        AbstractC3324l.crashlytics(arrayList, this.amazon.invoke(c2312l));
    }

    @Override // defpackage.InterfaceC4182l
    public final boolean loadAd(C2312l c2312l) {
        C18028l c18028l = this.amazon;
        Object obj = ((ConcurrentHashMap) c18028l.f35306l).get(c2312l);
        return ((obj == null || obj == EnumC12766l.f25151l) ? amazon(c2312l) : (InterfaceC9921l) c18028l.invoke(c2312l)) == null;
    }

    @Override // defpackage.InterfaceC4182l
    public final Collection remoteconfig(C2312l c2312l, Function1 function1) {
        return C5746l.f12138l;
    }

    @Override // defpackage.InterfaceC4182l
    public final List yandex(C2312l c2312l) {
        return AbstractC14055l.vip(this.amazon.invoke(c2312l));
    }
}
