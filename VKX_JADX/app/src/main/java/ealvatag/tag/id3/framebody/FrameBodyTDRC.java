package ealvatag.tag.id3.framebody;

import defpackage.AbstractC15690l;
import defpackage.C0869l;
import defpackage.C13975l;
import defpackage.C17500l;
import defpackage.EnumC8711l;
import defpackage.InterfaceC15756l;
import ealvatag.tag.datatype.DataTypes;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class FrameBodyTDRC extends AbstractFrameBodyTextInfo implements ID3v24FrameBody {
    private static final InterfaceC15756l LOG;
    private static final int PRECISION_DAY = 3;
    private static final int PRECISION_HOUR = 2;
    private static final int PRECISION_MINUTE = 1;
    private static final int PRECISION_MONTH = 4;
    private static final int PRECISION_SECOND = 0;
    private static final int PRECISION_YEAR = 5;
    private static SimpleDateFormat formatDateIn;
    private static SimpleDateFormat formatDateOut;
    private static SimpleDateFormat formatHoursOut;
    private static SimpleDateFormat formatMonthOut;
    private static SimpleDateFormat formatTimeIn;
    private static SimpleDateFormat formatTimeOut;
    private static SimpleDateFormat formatYearIn;
    private static SimpleDateFormat formatYearOut;
    private static final List<SimpleDateFormat> formatters;
    private String date;
    private boolean hoursOnly;
    private boolean monthOnly;
    private String originalID;
    private String time;
    private String year;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        LOG = new C13975l(4);
        ArrayList arrayList = new ArrayList();
        formatters = arrayList;
        Locale locale = Locale.UK;
        arrayList.add(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", locale));
        arrayList.add(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm", locale));
        arrayList.add(new SimpleDateFormat("yyyy-MM-dd'T'HH", locale));
        arrayList.add(new SimpleDateFormat("yyyy-MM-dd", locale));
        arrayList.add(new SimpleDateFormat("yyyy-MM", locale));
        arrayList.add(new SimpleDateFormat("yyyy", locale));
        formatYearIn = new SimpleDateFormat("yyyy", locale);
        formatDateIn = new SimpleDateFormat("ddMM", locale);
        formatTimeIn = new SimpleDateFormat("HHmm", locale);
        formatYearOut = new SimpleDateFormat("yyyy", locale);
        formatDateOut = new SimpleDateFormat("-MM-dd", locale);
        formatMonthOut = new SimpleDateFormat("-MM", locale);
        formatTimeOut = new SimpleDateFormat("'T'HH:mm", locale);
        formatHoursOut = new SimpleDateFormat("'T'HH", locale);
    }

    public FrameBodyTDRC(FrameBodyTIME frameBodyTIME) {
        this.year = "";
        this.time = "";
        this.date = "";
        this.monthOnly = false;
        this.hoursOnly = false;
        this.originalID = "TIME";
        this.time = frameBodyTIME.getText();
        setHoursOnly(frameBodyTIME.isHoursOnly());
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, (byte) 0);
        setObjectValue(DataTypes.OBJ_TEXT, getFormattedText());
    }

    private void extractID3v23Formats(Date date, int i) {
        InterfaceC15756l interfaceC15756l = LOG;
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        date.toString();
        ((C13975l) interfaceC15756l).getClass();
        int i2 = C17500l.yandex;
        if (i == 5) {
            setYear(formatDateAsYear(date));
            return;
        }
        if (i == 4) {
            setYear(formatDateAsYear(date));
            setDate(formatDateAsDate(date));
            this.monthOnly = true;
            return;
        }
        if (i == 3) {
            setYear(formatDateAsYear(date));
            setDate(formatDateAsDate(date));
            return;
        }
        if (i == 2) {
            setYear(formatDateAsYear(date));
            setDate(formatDateAsDate(date));
            setTime(formatDateAsTime(date));
            this.hoursOnly = true;
            return;
        }
        if (i == 1) {
            setYear(formatDateAsYear(date));
            setDate(formatDateAsDate(date));
            setTime(formatDateAsTime(date));
        } else if (i == 0) {
            setYear(formatDateAsYear(date));
            setDate(formatDateAsDate(date));
            setTime(formatDateAsTime(date));
        }
    }

    private static synchronized String formatAndParse(SimpleDateFormat simpleDateFormat, SimpleDateFormat simpleDateFormat2, String str) {
        try {
        } catch (ParseException unused) {
            InterfaceC15756l interfaceC15756l = LOG;
            EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
            ((C13975l) interfaceC15756l).getClass();
            int i = C17500l.yandex;
            return "";
        }
        return simpleDateFormat.format(simpleDateFormat2.parse(str));
    }

    private static synchronized String formatDateAsDate(Date date) {
        return formatDateIn.format(date);
    }

    private static synchronized String formatDateAsTime(Date date) {
        return formatTimeIn.format(date);
    }

    private static synchronized String formatDateAsYear(Date date) {
        return formatYearIn.format(date);
    }

    public void findMatchingMaskAndExtractV3Values() {
        Date date;
        int i = 0;
        while (true) {
            List<SimpleDateFormat> list = formatters;
            if (i >= list.size()) {
                return;
            }
            try {
                synchronized (list.get(i)) {
                    date = list.get(i).parse(getText());
                }
                if (date != null) {
                    extractID3v23Formats(date, i);
                    return;
                }
                i++;
            } catch (NumberFormatException unused) {
                InterfaceC15756l interfaceC15756l = LOG;
                EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
                formatters.get(i).toPattern();
                getText();
                ((C13975l) interfaceC15756l).getClass();
                int i2 = C17500l.yandex;
            } catch (ParseException unused2) {
            }
        }
    }

    public String getDate() {
        return this.date;
    }

    public String getFormattedText() {
        StringBuilder sb = new StringBuilder();
        if (this.originalID == null) {
            return getText();
        }
        String str = this.year;
        if (str != null && !str.trim().isEmpty()) {
            sb.append(formatAndParse(formatYearOut, formatYearIn, this.year));
        }
        if (!this.date.equals("")) {
            boolean zIsMonthOnly = isMonthOnly();
            String str2 = this.date;
            if (zIsMonthOnly) {
                sb.append(formatAndParse(formatMonthOut, formatDateIn, str2));
            } else {
                sb.append(formatAndParse(formatDateOut, formatDateIn, str2));
            }
        }
        if (!this.time.equals("")) {
            boolean zIsHoursOnly = isHoursOnly();
            String str3 = this.time;
            if (zIsHoursOnly) {
                sb.append(formatAndParse(formatHoursOut, formatTimeIn, str3));
            } else {
                sb.append(formatAndParse(formatTimeOut, formatTimeIn, str3));
            }
        }
        return sb.toString();
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "TDRC";
    }

    public String getOriginalID() {
        return this.originalID;
    }

    public String getTime() {
        return this.time;
    }

    public String getYear() {
        return this.year;
    }

    public boolean isHoursOnly() {
        return this.hoursOnly;
    }

    public boolean isMonthOnly() {
        return this.monthOnly;
    }

    public void setDate(String str) {
        InterfaceC15756l interfaceC15756l = LOG;
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        ((C13975l) interfaceC15756l).getClass();
        int i = C17500l.yandex;
        this.date = str;
    }

    public void setHoursOnly(boolean z) {
        this.hoursOnly = z;
    }

    public void setMonthOnly(boolean z) {
        this.monthOnly = z;
    }

    public void setTime(String str) {
        InterfaceC15756l interfaceC15756l = LOG;
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        ((C13975l) interfaceC15756l).getClass();
        int i = C17500l.yandex;
        this.time = str;
    }

    public void setYear(String str) {
        InterfaceC15756l interfaceC15756l = LOG;
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        ((C13975l) interfaceC15756l).getClass();
        int i = C17500l.yandex;
        this.year = str;
    }

    public FrameBodyTDRC(FrameBodyTDRC frameBodyTDRC) {
        super(frameBodyTDRC);
        this.year = "";
        this.time = "";
        this.date = "";
        this.monthOnly = false;
        this.hoursOnly = false;
    }

    public FrameBodyTDRC(FrameBodyTYER frameBodyTYER) {
        this.year = "";
        this.time = "";
        this.date = "";
        this.monthOnly = false;
        this.hoursOnly = false;
        this.originalID = "TYER";
        this.year = frameBodyTYER.getText();
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, (byte) 0);
        setObjectValue(DataTypes.OBJ_TEXT, getFormattedText());
    }

    public FrameBodyTDRC() {
        this.year = "";
        this.time = "";
        this.date = "";
        this.monthOnly = false;
        this.hoursOnly = false;
    }

    public FrameBodyTDRC(FrameBodyTDAT frameBodyTDAT) {
        this.year = "";
        this.time = "";
        this.date = "";
        this.monthOnly = false;
        this.hoursOnly = false;
        this.originalID = "TDAT";
        this.date = frameBodyTDAT.getText();
        setMonthOnly(frameBodyTDAT.isMonthOnly());
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, (byte) 0);
        setObjectValue(DataTypes.OBJ_TEXT, getFormattedText());
    }

    public FrameBodyTDRC(FrameBodyTRDA frameBodyTRDA) {
        this.year = "";
        this.time = "";
        this.date = "";
        this.monthOnly = false;
        this.hoursOnly = false;
        this.originalID = "TRDA";
        this.date = frameBodyTRDA.getText();
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, (byte) 0);
        setObjectValue(DataTypes.OBJ_TEXT, getFormattedText());
    }

    public FrameBodyTDRC(byte b, String str) {
        super(b, str);
        this.year = "";
        this.time = "";
        this.date = "";
        this.monthOnly = false;
        this.hoursOnly = false;
        findMatchingMaskAndExtractV3Values();
    }

    public FrameBodyTDRC(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
        this.year = "";
        this.time = "";
        this.date = "";
        this.monthOnly = false;
        this.hoursOnly = false;
        findMatchingMaskAndExtractV3Values();
    }

    public FrameBodyTDRC(C0869l c0869l, int i) {
        super(c0869l, i);
        this.year = "";
        this.time = "";
        this.date = "";
        this.monthOnly = false;
        this.hoursOnly = false;
        findMatchingMaskAndExtractV3Values();
    }
}
