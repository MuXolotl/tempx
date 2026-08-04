package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.util.Xml;
import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: renamed from: lٍؘٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5573l {
    public static final Object yandex = new Object();
    public static final String[] loadAd = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] crashlytics = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] amazon = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static /* synthetic */ boolean Signature(int i, AbstractC6082l abstractC6082l, StringBuilder sb) {
        if (i - 1 != 0 || abstractC6082l == AbstractC6082l.yandex) {
            return false;
        }
        sb.append(abstractC6082l.yandex());
        sb.append('.');
        sb.append(abstractC6082l.loadAd());
        sb.append(':');
        sb.append(abstractC6082l.crashlytics());
        return true;
    }

    public static int adcel(double d) {
        if (Double.isNaN(d)) {
            C8339l.metrica("Cannot round NaN value.");
            return 0;
        }
        if (d > 2.147483647E9d) {
            return Alert.DURATION_SHOW_INDEFINITELY;
        }
        return d < -2.147483648E9d ? RecyclerView.UNDEFINED_DURATION : (int) Math.round(d);
    }

    public static C13708l admob(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        C16971l c16971lMetrica = AbstractC1186l.metrica();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (AbstractC1019l.mopub(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strAmazon = AbstractC1019l.amazon(xmlPullParser, strConcat3);
                String strAmazon2 = AbstractC1019l.amazon(xmlPullParser, strConcat4);
                String strAmazon3 = AbstractC1019l.amazon(xmlPullParser, strConcat5);
                String strAmazon4 = AbstractC1019l.amazon(xmlPullParser, strConcat6);
                if (strAmazon == null || strAmazon2 == null) {
                    return C13708l.f26763l;
                }
                c16971lMetrica.crashlytics(new C4268l(strAmazon, strAmazon3 != null ? Long.parseLong(strAmazon3) : 0L, strAmazon4 != null ? Long.parseLong(strAmazon4) : 0L));
            }
        } while (!AbstractC1019l.billing(xmlPullParser, strConcat2));
        return c16971lMetrica.mopub();
    }

    public static int ads(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        C8339l.metrica("Cannot round NaN value.");
        return 0;
    }

    public static boolean amazon(Object obj, Map map) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static final InterfaceC12001l billing(InterfaceC12001l interfaceC12001l) {
        return interfaceC12001l.billing(new C8079l(C16589l.yandex));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC7150l crashlytics(AbstractC14971l abstractC14971l) {
        if ((abstractC14971l.f29450l & 2) != 0) {
            if (abstractC14971l instanceof InterfaceC7150l) {
                return (InterfaceC7150l) abstractC14971l;
            }
            if (abstractC14971l instanceof AbstractC11340l) {
                AbstractC14971l abstractC14971l2 = ((AbstractC11340l) abstractC14971l).f22875l;
                while (abstractC14971l2 != 0) {
                    if (abstractC14971l2 instanceof InterfaceC7150l) {
                        return (InterfaceC7150l) abstractC14971l2;
                    }
                    abstractC14971l2 = (!(abstractC14971l2 instanceof AbstractC11340l) || (abstractC14971l2.f29450l & 2) == 0) ? abstractC14971l2.f29460l : ((AbstractC11340l) abstractC14971l2).f22875l;
                }
            }
        }
        return null;
    }

    public static final void firebase(InterfaceC8605l interfaceC8605l) {
        C4580l autofillManager;
        C3654l c3654lMetrica = metrica(interfaceC8605l);
        if (c3654lMetrica.f7670l) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l = (ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5672l.yandex(c3654lMetrica);
        if (!ViewTreeObserverOnGlobalLayoutListenerC13840l.amazon() || (autofillManager = viewTreeObserverOnGlobalLayoutListenerC13840l.m3779getAutofillManager()) == null) {
            return;
        }
        Rect rect = autofillManager.f9297l;
        C0151l c0151l = autofillManager.f9295l;
        C3654l c3654l = (C3654l) c0151l.yandex.loadAd(c3654lMetrica.f7685l);
        if (c3654l == null || c3654l.f7674l == -4) {
            return;
        }
        C13698l c13698l = c0151l.crashlytics;
        int iPurchase = c0151l.purchase(c3654l);
        long[] jArr = (long[]) c13698l.f26743l;
        long j = jArr[iPurchase];
        long j2 = jArr[iPurchase + 1];
        rect.set((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2);
        autofillManager.f9293l.mopub(autofillManager.f9289l, c3654lMetrica.f7685l, rect);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0046 A[EXC_TOP_SPLITTER, PHI: r1
  0x0046: PHI (r1v2 java.lang.String) = (r1v0 java.lang.String), (r1v4 java.lang.String) binds: [B:29:0x0053, B:23:0x0044] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public static String isPro(Context context) {
        String attributeValue;
        synchronized (yandex) {
            attributeValue = "";
            try {
                FileInputStream fileInputStreamOpenFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                try {
                    try {
                        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                        xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, "UTF-8");
                        int depth = xmlPullParserNewPullParser.getDepth();
                        while (true) {
                            int next = xmlPullParserNewPullParser.next();
                            if (next != 1 && (next != 3 || xmlPullParserNewPullParser.getDepth() > depth)) {
                                if (next != 3 && next != 4 && xmlPullParserNewPullParser.getName().equals("locales")) {
                                    attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "application_locales");
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        if (fileInputStreamOpenFileInput != null) {
                            try {
                                fileInputStreamOpenFileInput.close();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (IOException | XmlPullParserException unused2) {
                        Log.w("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                        }
                    }
                    if (attributeValue.isEmpty()) {
                        context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    }
                } catch (Throwable th) {
                    if (fileInputStreamOpenFileInput != null) {
                        try {
                            fileInputStreamOpenFileInput.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused4) {
                return "";
            }
        }
        return attributeValue;
    }

    public static final AbstractC14971l loadAd(C17893l c17893l) {
        int i;
        if (c17893l == null || (i = c17893l.f34846l) == 0) {
            return null;
        }
        return (AbstractC14971l) c17893l.vip(i - 1);
    }

    public static final C3654l metrica(InterfaceC8605l interfaceC8605l) {
        AbstractC18026l abstractC18026l = ((AbstractC14971l) interfaceC8605l).f29454l.f29452l;
        if (abstractC18026l != null) {
            return abstractC18026l.f35281l;
        }
        throw AbstractC5020l.metrica("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static C3253l mopub(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!AbstractC1019l.mopub(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw C17655l.yandex(null, "Couldn't find xmp metadata");
        }
        C9258l c9258l = AbstractC1186l.f3181l;
        C13708l c13708lAdmob = C13708l.f26763l;
        long j = -9223372036854775807L;
        loop0: do {
            xmlPullParserNewPullParser.next();
            if (AbstractC1019l.mopub(xmlPullParserNewPullParser, "rdf:Description")) {
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    String strAmazon = AbstractC1019l.amazon(xmlPullParserNewPullParser, loadAd[i2]);
                    if (strAmazon != null) {
                        if (Integer.parseInt(strAmazon) != 1) {
                            break loop0;
                        }
                        int i3 = 0;
                        while (true) {
                            if (i3 < 4) {
                                String strAmazon2 = AbstractC1019l.amazon(xmlPullParserNewPullParser, crashlytics[i3]);
                                if (strAmazon2 != null) {
                                    j = Long.parseLong(strAmazon2);
                                    if (j != -1) {
                                        break;
                                    }
                                    break;
                                }
                                i3++;
                            }
                            j = -9223372036854775807L;
                            break;
                        }
                        while (true) {
                            if (i >= 2) {
                                C9258l c9258l2 = AbstractC1186l.f3181l;
                                c13708lAdmob = C13708l.f26763l;
                                break;
                            }
                            String strAmazon3 = AbstractC1019l.amazon(xmlPullParserNewPullParser, amazon[i]);
                            if (strAmazon3 != null) {
                                c13708lAdmob = AbstractC1186l.signatures(new C4268l("image/jpeg", 0L, 0L), new C4268l("video/mp4", Long.parseLong(strAmazon3), 0L));
                                break;
                            }
                            i++;
                        }
                    }
                }
                return null;
            }
            if (AbstractC1019l.mopub(xmlPullParserNewPullParser, "Container:Directory")) {
                c13708lAdmob = admob(xmlPullParserNewPullParser, "Container", "Item");
            } else if (AbstractC1019l.mopub(xmlPullParserNewPullParser, "GContainer:Directory")) {
                c13708lAdmob = admob(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!AbstractC1019l.billing(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (c13708lAdmob.isEmpty()) {
            break loop0;
        }
        return new C3253l(j, c13708lAdmob, 3);
        return null;
    }

    public static final InterfaceC12001l purchase(InterfaceC12001l interfaceC12001l) {
        return billing(interfaceC12001l).billing(new C4538l(C16589l.yandex));
    }

    public static final InterfaceC3685l remoteconfig(InterfaceC8605l interfaceC8605l) {
        return ((ViewTreeObserverOnGlobalLayoutListenerC13840l) startapp(interfaceC8605l)).getGraphicsContext();
    }

    public static final AbstractC18026l smaato(InterfaceC8605l interfaceC8605l, int i) {
        AbstractC18026l abstractC18026l = ((AbstractC14971l) interfaceC8605l).f29454l.f29452l;
        return (abstractC18026l.mo2643l() == interfaceC8605l && AbstractC3068l.mopub(i)) ? abstractC18026l.f35271l : abstractC18026l;
    }

    public static final InterfaceC11218l startapp(InterfaceC8605l interfaceC8605l) {
        InterfaceC11218l interfaceC11218l = metrica(interfaceC8605l).f7680l;
        if (interfaceC11218l != null) {
            return interfaceC11218l;
        }
        throw AbstractC5020l.metrica("This node does not have an owner.");
    }

    /* JADX WARN: Code duplicated, block: B:42:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void subs(Context context, String str) {
        synchronized (yandex) {
            if (str.equals("")) {
                context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                return;
            }
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
                XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                try {
                    try {
                        xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                        xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
                        xmlSerializerNewSerializer.startTag(null, "locales");
                        xmlSerializerNewSerializer.attribute(null, "application_locales", str);
                        xmlSerializerNewSerializer.endTag(null, "locales");
                        xmlSerializerNewSerializer.endDocument();
                        if (fileOutputStreamOpenFileOutput != null) {
                            try {
                                fileOutputStreamOpenFileOutput.close();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (Exception e) {
                        Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales in storage ", e);
                        if (fileOutputStreamOpenFileOutput != null) {
                            fileOutputStreamOpenFileOutput.close();
                        }
                    }
                } catch (Throwable th) {
                    if (fileOutputStreamOpenFileOutput != null) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused3) {
                Log.w("AppLocalesStorageHelper", "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing ");
            }
        }
    }

    public static long subscription(double d) {
        if (!Double.isNaN(d)) {
            return Math.round(d);
        }
        C8339l.metrica("Cannot round NaN value.");
        return 0L;
    }

    public static final InterfaceC12001l tapsense(InterfaceC12001l interfaceC12001l) {
        return interfaceC12001l.billing(new C8079l(C10365l.yandex));
    }

    public static final AbstractC18026l vip(InterfaceC8605l interfaceC8605l) {
        if (!((AbstractC14971l) interfaceC8605l).f29454l.f29462l) {
            AbstractC0081l.crashlytics("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        AbstractC18026l abstractC18026lSmaato = smaato(interfaceC8605l, 2);
        abstractC18026lSmaato.getClass();
        if (!abstractC18026lSmaato.mo2643l().f29462l) {
            AbstractC0081l.crashlytics("LayoutCoordinates is not attached.");
        }
        return abstractC18026lSmaato;
    }

    public static final void yandex(C17893l c17893l, AbstractC14971l abstractC14971l) {
        C17893l c17893lSignatures = metrica(abstractC14971l).signatures();
        int i = c17893lSignatures.f34846l - 1;
        Object[] objArr = c17893lSignatures.f34848l;
        if (i < objArr.length) {
            while (i >= 0) {
                c17893l.crashlytics((AbstractC14971l) ((C3654l) objArr[i]).f7703l.mopub);
                i--;
            }
        }
    }
}
