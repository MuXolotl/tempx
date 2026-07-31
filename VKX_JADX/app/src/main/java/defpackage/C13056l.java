package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lْؑ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13056l {
    public static final C2540l firebase = AbstractC10433l.yandex("http://localhost");
    public List admob;
    public C17289l amazon;
    public String billing;
    public int crashlytics;
    public C6921l isPro;
    public boolean loadAd;
    public String mopub;
    public String purchase;
    public InterfaceC0112l subs;
    public String yandex;

    public C13056l() throws EOFException {
        InterfaceC14665l.loadAd.getClass();
        this.yandex = "";
        this.loadAd = false;
        this.crashlytics = 0;
        this.amazon = null;
        this.purchase = null;
        this.billing = null;
        Set set = AbstractC2208l.yandex;
        Charset charset = AbstractC9050l.yandex;
        StringBuilder sb = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        C18476l c18476l = new C18476l();
        AbstractC15788l.crashlytics(charsetEncoderNewEncoder, c18476l, "", 0, 0);
        while (!c18476l.subs()) {
            while (!c18476l.subs()) {
                byte b = c18476l.readByte();
                Byte bValueOf = Byte.valueOf(b);
                if (b == 32) {
                    sb.append("%20");
                } else if (AbstractC2208l.yandex.contains(bValueOf) || AbstractC2208l.crashlytics.contains(bValueOf)) {
                    sb.append((char) b);
                } else {
                    sb.append(AbstractC2208l.mopub(b));
                }
                Unit unit = Unit.INSTANCE;
            }
        }
        this.mopub = sb.toString();
        this.admob = new ArrayList(AbstractC14055l.billing(C2580l.f5619l, 10));
        C10954l c10954l = new C10954l(13);
        C17255l.f33480l.getClass();
        this.subs = c10954l;
        this.isPro = new C6921l(c10954l);
    }

    public final C17289l amazon() {
        C17289l c17289l = this.amazon;
        if (c17289l != null) {
            return c17289l;
        }
        C17289l c17289l2 = C17289l.f33552l;
        return C17289l.f33552l;
    }

    public final String crashlytics() throws IOException {
        yandex();
        StringBuilder sb = new StringBuilder(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        AbstractC11036l.yandex(this, sb);
        return sb.toString();
    }

    public final C2540l loadAd() {
        yandex();
        C17289l c17289l = this.amazon;
        String str = this.yandex;
        int i = this.crashlytics;
        List list = this.admob;
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC2208l.crashlytics(0, 0, 7, (String) it.next()));
        }
        InterfaceC14665l interfaceC14665lAmazon = AbstractC11064l.amazon((InterfaceC0112l) this.isPro.f14493l);
        AbstractC2208l.amazon(0, 0, 15, this.mopub);
        String str2 = this.purchase;
        String strCrashlytics = str2 != null ? AbstractC2208l.crashlytics(0, 0, 7, str2) : null;
        String str3 = this.billing;
        return new C2540l(c17289l, str, i, arrayList, interfaceC14665lAmazon, strCrashlytics, str3 != null ? AbstractC2208l.crashlytics(0, 0, 7, str3) : null, this.loadAd, crashlytics());
    }

    public final void purchase(int i) {
        if (i < 0 || i >= 65536) {
            C10754l.metrica(AbstractC0653l.vip(i, "Port must be between 0 and 65535, or 0 if not set. Provided: "));
        } else {
            this.crashlytics = i;
        }
    }

    public final String toString() throws IOException {
        StringBuilder sb = new StringBuilder(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        AbstractC11036l.yandex(this, sb);
        return sb.toString();
    }

    public final void yandex() {
        if (this.yandex.length() <= 0 && !amazon().f33556l.equals("file")) {
            C2540l c2540l = firebase;
            this.yandex = c2540l.f5529l;
            if (this.amazon == null) {
                this.amazon = c2540l.f5530l;
            }
            if (this.crashlytics == 0) {
                purchase(c2540l.f5528l);
            }
        }
    }
}
