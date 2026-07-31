package defpackage;

import android.os.Handler;
import java.io.File;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؘَؙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5583l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f11856l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f11857l;

    public /* synthetic */ C5583l(int i, Function0 function0) {
        this.f11857l = i;
        this.f11856l = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f11857l;
        boolean z = false;
        Function0 function0 = this.f11856l;
        switch (i) {
            case 0:
                function0.invoke();
                return Boolean.TRUE;
            case 1:
                return new C16229l((List) function0.invoke());
            case 2:
                return Float.valueOf(AbstractC18079l.crashlytics.yandex(((Number) function0.invoke()).floatValue()));
            case 3:
                return Float.valueOf(1.0f - ((Number) function0.invoke()).floatValue());
            case 4:
                return Boolean.valueOf(((Number) function0.invoke()).floatValue() < 0.5f);
            case 5:
                try {
                    return (List) function0.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return C2580l.f5619l;
                }
            case 6:
                function0.invoke();
                return Unit.INSTANCE;
            case 7:
                File file = (File) function0.invoke();
                if (AbstractC12024l.m3348transient('.', file.getName(), "").equals("preferences_pb")) {
                    return file.getAbsoluteFile();
                }
                C8936l.firebase(file, " does not match required extension for Preferences file: preferences_pb", "File extension for file: ");
                return null;
            case 8:
                float fFloatValue = ((Number) function0.invoke()).floatValue();
                if (fFloatValue < 0.0f) {
                    fFloatValue = 0.0f;
                }
                return Float.valueOf(fFloatValue <= 1.0f ? fFloatValue : 1.0f);
            case 9:
                function0.invoke();
                return Boolean.TRUE;
            case 10:
                if (function0 != null) {
                    function0.invoke();
                    z = true;
                }
                return Boolean.valueOf(z);
            case 11:
                function0.invoke();
                return Boolean.TRUE;
            default:
                return (Handler) function0.invoke();
        }
    }
}
