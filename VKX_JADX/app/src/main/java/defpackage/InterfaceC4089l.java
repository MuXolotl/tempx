package defpackage;

import android.util.Size;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lْٜؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4089l extends InterfaceC15866l {
    public static final C6916l applovin;
    public static final C6916l appmetrica;
    public static final C6916l inmobi;

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public static final C6916l f8422native;

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static final C6916l f8423package;
    public static final C6916l premium = new C6916l("camerax.core.imageOutput.targetAspectRatio", AbstractC9905l.class, null);

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public static final C6916l f8424strictfp;

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static final C6916l f8425synchronized;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static final C6916l f8426throws;

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public static final C6916l f8427volatile;

    static {
        Class cls = Integer.TYPE;
        applovin = new C6916l("camerax.core.imageOutput.targetRotation", cls, null);
        appmetrica = new C6916l("camerax.core.imageOutput.appTargetRotation", cls, null);
        inmobi = new C6916l("camerax.core.imageOutput.mirrorMode", cls, null);
        f8426throws = new C6916l("camerax.core.imageOutput.targetResolution", Size.class, null);
        f8423package = new C6916l("camerax.core.imageOutput.defaultResolution", Size.class, null);
        f8425synchronized = new C6916l("camerax.core.imageOutput.maxResolution", Size.class, null);
        f8424strictfp = new C6916l("camerax.core.imageOutput.supportedResolutions", List.class, null);
        f8427volatile = new C6916l("camerax.core.imageOutput.resolutionSelector", C18085l.class, null);
        f8422native = new C6916l("camerax.core.imageOutput.customOrderedResolutions", List.class, null);
    }

    C18085l ad();

    C18085l admob();

    Size appmetrica();

    List billing();

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    boolean mo1482continue();

    /* JADX INFO: renamed from: finally, reason: not valid java name */
    int mo1483finally(int i);

    /* JADX INFO: renamed from: import, reason: not valid java name */
    Size mo1484import();

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    int mo1485interface();

    ArrayList pro();

    int remoteconfig();

    /* JADX INFO: renamed from: this, reason: not valid java name */
    int mo1486this();

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    Size mo1487volatile();
}
