package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.Unit;

/* JADX INFO: renamed from: lؘٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18454l implements InterfaceC18477l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final C18454l f36052l = new C18454l();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C3597l f36051l = purchase();

    public static C1887l amazon() {
        return new C1887l(false, 1.0f, 60.0f, 10.0f, -2.0f, 0.0f, C3844l.f7950l);
    }

    public static C15744l crashlytics() {
        return new C15744l(0.0f, 4, false);
    }

    public static C3554l loadAd() {
        float[] fArr = {32.0f, 63.0f, 125.0f, 250.0f, 500.0f, 1000.0f, 2000.0f, 4000.0f, 8000.0f, 16000.0f};
        ArrayList arrayList = new ArrayList(10);
        for (int i = 0; i < 10; i++) {
            arrayList.add(new C2882l(fArr[i], 0.0f));
        }
        return new C3554l("flat", "Flat", arrayList);
    }

    public static C3597l purchase() {
        float f = 0.0f;
        return new C3597l(loadAd(), yandex(), amazon(), new C7315l(true, f, f, 36), crashlytics(), crashlytics(), crashlytics(), crashlytics(), new C15697l(false, 0, EnumC1177l.LINEAR, C3844l.f7950l), 65536);
    }

    public static C18364l yandex() {
        return new C18364l(false, false, 0, 0, Collections.singletonList(new C7117l(85.0f, 1.0f, -45.0f, 0.0f)), C3844l.f7950l);
    }

    @Override // defpackage.InterfaceC18477l
    /* JADX INFO: renamed from: lؘؓؖ */
    public final Object mo2330l() {
        return f36051l;
    }

    @Override // defpackage.InterfaceC18477l
    /* JADX INFO: renamed from: lٖؖ۠ */
    public final Object mo2331l(InputStream inputStream) {
        C10180l c10180l = C3597l.f7518l;
        c10180l.getClass();
        return c10180l.crashlytics(new C7084l(new C1503l(AbstractC7709l.purchase(inputStream))));
    }

    @Override // defpackage.InterfaceC18477l
    /* JADX INFO: renamed from: lٌّۡ */
    public final Unit mo2332l(OutputStream outputStream, Object obj) {
        C3597l.f7518l.mopub(outputStream, (C3597l) obj);
        return Unit.INSTANCE;
    }
}
