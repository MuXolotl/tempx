package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: lٗۥؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17525l extends AbstractC7975l {
    public String amazon;
    public final Object crashlytics = new Object();
    public final C11701l loadAd = new C11701l();
    public final Context yandex;

    public C17525l(C18675l c18675l) {
        this.yandex = (Context) c18675l.f36444l;
    }

    @Override // defpackage.AbstractC7975l
    public final Uri admob(Uri uri) throws IOException {
        if (subs(uri)) {
            throw new C8413l("Operation across authorities is not allowed.");
        }
        File fileCrashlytics = crashlytics(uri);
        Uri.Builder builderPath = new Uri.Builder().scheme("file").authority("").path("/");
        C16971l c16971lMetrica = AbstractC1186l.metrica();
        builderPath.path(fileCrashlytics.getAbsolutePath());
        C13708l c13708lMopub = c16971lMetrica.mopub();
        Pattern pattern = AbstractC3260l.yandex;
        return builderPath.encodedFragment(c13708lMopub.isEmpty() ? null : "transform=".concat(new C1693l("+").billing(c13708lMopub))).build();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:61:0x0131  */
    /* JADX WARN: Code duplicated, block: B:65:0x0138 A[Catch: all -> 0x014b, TryCatch #0 {all -> 0x014b, blocks: (B:63:0x0134, B:65:0x0138, B:68:0x014d, B:69:0x014f), top: B:88:0x0134 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x015b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.InterfaceC14033l
    public final File crashlytics(Uri uri) throws IOException {
        File externalFilesDir;
        Account account;
        File file;
        String str;
        if (subs(uri)) {
            C18262l.metrica("operation is not permitted in other authorities.");
            return null;
        }
        Context context = this.yandex;
        if (!uri.getScheme().equals("android")) {
            throw new C8413l("Scheme must be 'android'");
        }
        if (uri.getPathSegments().isEmpty()) {
            throw new C8413l(String.format("Path must start with a valid logical location: %s", uri));
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new C8413l("Did not expect uri to have query");
        }
        ArrayList arrayList = new ArrayList(uri.getPathSegments());
        String str2 = (String) arrayList.get(0);
        switch (str2.hashCode()) {
            case -1820761141:
                if (str2.equals("external")) {
                    externalFilesDir = context.getExternalFilesDir(null);
                    file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!AbstractC18452l.yandex(context)) {
                        synchronized (this.crashlytics) {
                            try {
                                if (this.amazon == null) {
                                    this.amazon = AbstractC3483l.smaato(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                                }
                                str = this.amazon;
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                        if (!file.getAbsolutePath().startsWith(str)) {
                            throw new C1409l("Cannot access credential-protected data from direct boot");
                        }
                    }
                    return file;
                }
                throw new C8413l(String.format("Path must start with a valid logical location: %s", uri));
            case 94416770:
                if (str2.equals("cache")) {
                    externalFilesDir = context.getCacheDir();
                    file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!AbstractC18452l.yandex(context)) {
                        synchronized (this.crashlytics) {
                            if (this.amazon == null) {
                                this.amazon = AbstractC3483l.smaato(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                            }
                            str = this.amazon;
                            if (!file.getAbsolutePath().startsWith(str)) {
                                throw new C1409l("Cannot access credential-protected data from direct boot");
                            }
                        }
                    }
                    return file;
                }
                throw new C8413l(String.format("Path must start with a valid logical location: %s", uri));
            case 97434231:
                if (str2.equals("files")) {
                    externalFilesDir = AbstractC3483l.smaato(context);
                    file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!AbstractC18452l.yandex(context)) {
                        synchronized (this.crashlytics) {
                            if (this.amazon == null) {
                                this.amazon = AbstractC3483l.smaato(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                            }
                            str = this.amazon;
                            if (!file.getAbsolutePath().startsWith(str)) {
                                throw new C1409l("Cannot access credential-protected data from direct boot");
                            }
                        }
                    }
                    return file;
                }
                throw new C8413l(String.format("Path must start with a valid logical location: %s", uri));
            case 835260319:
                if (str2.equals("managed")) {
                    File file2 = new File(AbstractC3483l.smaato(context), "managed");
                    if (arrayList.size() >= 3) {
                        try {
                            String str3 = (String) arrayList.get(2);
                            Account account2 = AbstractC17151l.yandex;
                            if ("shared".equals(str3)) {
                                account = AbstractC17151l.yandex;
                            } else {
                                int iIndexOf = str3.indexOf(58);
                                AbstractC16181l.isPro(iIndexOf >= 0, "Malformed account", new Object[0]);
                                account = new Account(str3.substring(iIndexOf + 1), str3.substring(0, iIndexOf));
                            }
                            if (!AbstractC17151l.yandex.equals(account)) {
                                throw new C8413l("AccountManager cannot be null");
                            }
                        } catch (IllegalArgumentException e) {
                            throw new C8413l(e);
                        }
                    }
                    externalFilesDir = file2;
                    file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!AbstractC18452l.yandex(context)) {
                        synchronized (this.crashlytics) {
                            if (this.amazon == null) {
                                this.amazon = AbstractC3483l.smaato(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                            }
                            str = this.amazon;
                            if (!file.getAbsolutePath().startsWith(str)) {
                                throw new C1409l("Cannot access credential-protected data from direct boot");
                            }
                        }
                    }
                    return file;
                }
                throw new C8413l(String.format("Path must start with a valid logical location: %s", uri));
            case 988548496:
                if (str2.equals("directboot-cache")) {
                    int i = Build.VERSION.SDK_INT;
                    if (i < 24) {
                        throw new C8413l(AbstractC0653l.vip(i, "Direct boot only exists on N or greater: current SDK "));
                    }
                    externalFilesDir = context.createDeviceProtectedStorageContext().getCacheDir();
                    file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!AbstractC18452l.yandex(context)) {
                        synchronized (this.crashlytics) {
                            if (this.amazon == null) {
                                this.amazon = AbstractC3483l.smaato(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                            }
                            str = this.amazon;
                            if (!file.getAbsolutePath().startsWith(str)) {
                                throw new C1409l("Cannot access credential-protected data from direct boot");
                            }
                        }
                    }
                    return file;
                }
                throw new C8413l(String.format("Path must start with a valid logical location: %s", uri));
            case 991565957:
                if (str2.equals("directboot-files")) {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 < 24) {
                        throw new C8413l(AbstractC0653l.vip(i2, "Direct boot only exists on N or greater: current SDK "));
                    }
                    externalFilesDir = context.createDeviceProtectedStorageContext().getFilesDir();
                    file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!AbstractC18452l.yandex(context)) {
                        synchronized (this.crashlytics) {
                            if (this.amazon == null) {
                                this.amazon = AbstractC3483l.smaato(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                            }
                            str = this.amazon;
                            if (!file.getAbsolutePath().startsWith(str)) {
                                throw new C1409l("Cannot access credential-protected data from direct boot");
                            }
                        }
                    }
                    return file;
                }
                throw new C8413l(String.format("Path must start with a valid logical location: %s", uri));
            default:
                throw new C8413l(String.format("Path must start with a valid logical location: %s", uri));
        }
    }

    @Override // defpackage.InterfaceC14033l
    public final boolean loadAd(Uri uri) throws C1409l {
        if (subs(uri)) {
            throw new C1409l("Android backend cannot perform remote operations without a remote backend");
        }
        return C9552l.isPro(admob(uri)).exists();
    }

    @Override // defpackage.InterfaceC14033l
    public final String mopub() {
        return "android";
    }

    public final boolean subs(Uri uri) {
        return (TextUtils.isEmpty(uri.getAuthority()) || this.yandex.getPackageName().equals(uri.getAuthority())) ? false : true;
    }

    @Override // defpackage.InterfaceC14033l
    public final C2279l yandex(Uri uri) throws C8413l, C1409l {
        if (subs(uri)) {
            throw new C1409l("Android backend cannot perform remote operations without a remote backend");
        }
        File fileIsPro = C9552l.isPro(admob(uri));
        return new C2279l(new FileInputStream(fileIsPro), fileIsPro);
    }
}
