package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lؘٓؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5663l implements InterfaceC2262l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final File f12023l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C5663l f12024l = new C5663l();

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final AbstractC7188l f12025l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C18662l f12026l = AbstractC11990l.loadAd();

    static {
        VKXApplication vKXApplication = VKXApplication.f36631l;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        f12023l = vKXApplication.getFilesDir();
        C12952l c12952l = VKXApplication.f36629l;
        C0861l c0861l = C0861l.crashlytics;
        f12025l = AbstractC9968l.yandex(c12952l, AbstractC18202l.loadAd(List.class, AbstractC12953l.smaato(AbstractC18202l.yandex(String.class))));
    }

    public static void loadAd(String str) {
        if (((Boolean) C4626l.loadAd.getValue()).booleanValue() || yandex().contains(str) || AbstractC12024l.m3315catch(str)) {
            return;
        }
        ArrayList arrayList = new ArrayList(yandex());
        arrayList.add(0, str);
        List listM4247try = AbstractC16901l.m4247try(arrayList, 5);
        File file = new File(f12023l, "OrbitSearchHistory.dat");
        if (!file.exists()) {
            file.createNewFile();
        }
        AbstractC2030l.metrica(file, f12025l.purchase(listM4247try));
    }

    public static List yandex() {
        List list;
        File file = f12023l;
        try {
            AbstractC7188l abstractC7188l = f12025l;
            File file2 = new File(file, "OrbitSearchHistory.dat");
            if (!file2.exists()) {
                file2.createNewFile();
            }
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file2), AbstractC9050l.yandex);
            try {
                StringWriter stringWriter = new StringWriter();
                char[] cArr = new char[8192];
                for (int i = inputStreamReader.read(cArr); i >= 0; i = inputStreamReader.read(cArr)) {
                    stringWriter.write(cArr, 0, i);
                }
                String string = stringWriter.toString();
                inputStreamReader.close();
                list = (List) abstractC7188l.crashlytics(string);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC7876l.loadAd(inputStreamReader, th);
                    throw th2;
                }
            }
        } catch (Throwable unused) {
            new File(file, "OrbitSearchHistory.dat").delete();
            list = null;
        }
        return list == null ? C2580l.f5619l : list;
    }

    @Override // defpackage.InterfaceC2262l
    public final InterfaceC12932l vip() {
        return this.f12026l.f36440l;
    }
}
