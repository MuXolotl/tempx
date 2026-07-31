package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: lِ۟ۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12160l implements InterfaceC14090l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final InterfaceC14090l f24159l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public InterfaceC14090l f24160l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public C6601l f24161l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final ArrayList f24162l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Context f24163l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public C1737l f24164l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C9414l f24165l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C1337l f24166l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public C5946l f24167l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C9393l f24168l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public InterfaceC14090l f24169l;

    public C12160l(Context context, InterfaceC14090l interfaceC14090l) {
        this.f24163l = context.getApplicationContext();
        interfaceC14090l.getClass();
        this.f24159l = interfaceC14090l;
        this.f24162l = new ArrayList();
    }

    public static void startapp(InterfaceC14090l interfaceC14090l, C7713l c7713l) {
        if (interfaceC14090l != null) {
            interfaceC14090l.metrica(c7713l);
        }
    }

    @Override // defpackage.InterfaceC14090l
    public final void close() {
        InterfaceC14090l interfaceC14090l = this.f24169l;
        if (interfaceC14090l != null) {
            try {
                interfaceC14090l.close();
            } finally {
                this.f24169l = null;
            }
        }
    }

    @Override // defpackage.InterfaceC14090l
    public final long crashlytics(C2432l c2432l) {
        AbstractC12442l.subscription(this.f24169l == null);
        Uri uri = c2432l.yandex;
        String scheme = uri.getScheme();
        String str = AbstractC15323l.yandex;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f24163l;
        if (zIsEmpty || Objects.equals(scheme2, "file")) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f24166l == null) {
                    C1337l c1337l = new C1337l(false);
                    this.f24166l = c1337l;
                    firebase(c1337l);
                }
                this.f24169l = this.f24166l;
            } else {
                if (this.f24165l == null) {
                    C9414l c9414l = new C9414l(context);
                    this.f24165l = c9414l;
                    firebase(c9414l);
                }
                this.f24169l = this.f24165l;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f24165l == null) {
                C9414l c9414l2 = new C9414l(context);
                this.f24165l = c9414l2;
                firebase(c9414l2);
            }
            this.f24169l = this.f24165l;
        } else if ("content".equals(scheme)) {
            if (this.f24168l == null) {
                C9393l c9393l = new C9393l(context);
                this.f24168l = c9393l;
                firebase(c9393l);
            }
            this.f24169l = this.f24168l;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            InterfaceC14090l interfaceC14090l = this.f24159l;
            if (zEquals) {
                if (this.f24160l == null) {
                    try {
                        InterfaceC14090l interfaceC14090l2 = (InterfaceC14090l) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.f24160l = interfaceC14090l2;
                        firebase(interfaceC14090l2);
                    } catch (ClassNotFoundException unused) {
                        AbstractC6427l.vip("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        C18073l.Signature("Error instantiating RTMP extension", e);
                        return 0L;
                    }
                    if (this.f24160l == null) {
                        this.f24160l = interfaceC14090l;
                    }
                }
                this.f24169l = this.f24160l;
            } else if ("udp".equals(scheme)) {
                if (this.f24161l == null) {
                    C6601l c6601l = new C6601l();
                    this.f24161l = c6601l;
                    firebase(c6601l);
                }
                this.f24169l = this.f24161l;
            } else if ("data".equals(scheme)) {
                if (this.f24167l == null) {
                    C5946l c5946l = new C5946l(false);
                    this.f24167l = c5946l;
                    firebase(c5946l);
                }
                this.f24169l = this.f24167l;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f24164l == null) {
                    C1737l c1737l = new C1737l(context);
                    this.f24164l = c1737l;
                    firebase(c1737l);
                }
                this.f24169l = this.f24164l;
            } else {
                this.f24169l = interfaceC14090l;
            }
        }
        return this.f24169l.crashlytics(c2432l);
    }

    public final void firebase(InterfaceC14090l interfaceC14090l) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f24162l;
            if (i >= arrayList.size()) {
                return;
            }
            interfaceC14090l.metrica((C7713l) arrayList.get(i));
            i++;
        }
    }

    @Override // defpackage.InterfaceC14090l
    public final Map isPro() {
        InterfaceC14090l interfaceC14090l = this.f24169l;
        return interfaceC14090l == null ? Collections.EMPTY_MAP : interfaceC14090l.isPro();
    }

    @Override // defpackage.InterfaceC14090l
    public final void metrica(C7713l c7713l) {
        c7713l.getClass();
        this.f24159l.metrica(c7713l);
        this.f24162l.add(c7713l);
        startapp(this.f24166l, c7713l);
        startapp(this.f24165l, c7713l);
        startapp(this.f24168l, c7713l);
        startapp(this.f24160l, c7713l);
        startapp(this.f24161l, c7713l);
        startapp(this.f24167l, c7713l);
        startapp(this.f24164l, c7713l);
    }

    @Override // defpackage.InterfaceC5802l
    public final int read(byte[] bArr, int i, int i2) {
        InterfaceC14090l interfaceC14090l = this.f24169l;
        interfaceC14090l.getClass();
        return interfaceC14090l.read(bArr, i, i2);
    }

    @Override // defpackage.InterfaceC14090l
    public final Uri vip() {
        InterfaceC14090l interfaceC14090l = this.f24169l;
        if (interfaceC14090l == null) {
            return null;
        }
        return interfaceC14090l.vip();
    }
}
